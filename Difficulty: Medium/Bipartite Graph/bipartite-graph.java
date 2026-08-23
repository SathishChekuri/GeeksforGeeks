class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<V;i++){
            ar.add(new ArrayList<>());
        }
        for(int arr[]:edges){
            ar.get(arr[0]).add(arr[1]);
            ar.get(arr[1]).add(arr[0]);
        }
        int [] color=new int[V];
        for(int i=0;i<V;i++){
            if(color[i]==0){
                if(!dfs(i,color,ar,1)) return false;
            }
        }
        return true;
    }
    boolean dfs(int vertex,int [] color,ArrayList<ArrayList<Integer>> adl,int c){
        color[vertex]=c;
        int child_color=0;
        if(c==1) child_color=2;
        else child_color=1;
        for(int i:adl.get(vertex)){
             if(color[i]==0){
                 if(!dfs(i,color,adl,child_color)) return false;
             }
             else if(color[i]==color[vertex]){
                 return false;
             }
        }
        return true;
    }
}