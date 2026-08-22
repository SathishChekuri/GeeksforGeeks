class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<V;i++){
            ar.add(new ArrayList<>());
        }
        for(int [] arr:edges){
            ar.get(arr[0]).add(arr[1]);
            //ar.get(arr[1]).add(arr[0]);
        }
        boolean [] visited=new boolean[V];
        boolean [] path=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,path,visited,ar)) return true;
            }
        }
        return false;
    }
    boolean dfs(int n,boolean path[],boolean [] visited,ArrayList<ArrayList<Integer>> ar){
        visited[n]=true;
        path[n]=true;
        for(int i:ar.get(n)){
            if(!visited[i]){
                if(dfs(i,path,visited,ar)) return true;
            }
            else if(path[i]) return true;
        }
        path[n]=false;
        return false;
    }
}