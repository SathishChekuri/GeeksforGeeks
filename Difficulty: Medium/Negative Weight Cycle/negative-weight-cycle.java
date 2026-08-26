class Solution {
    public boolean isNegativeWeightCycle(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Pair>> ar=new ArrayList<>();
        boolean [] visited=new boolean[V];
        boolean path[]=new boolean[V];
        int wt[]=new int[V];
        for(int i=0;i<V;i++){
            ar.add(new ArrayList<>());
        }
        for(int arr[]:edges){
            ar.get(arr[0]).add(new Pair(arr[1],arr[2]));
        }
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,0,path,visited,wt,ar)) return true;
            }
        }
        return false;
    }
    boolean dfs(int node,int cwt,boolean path[],boolean[] visited,int []wt,ArrayList<ArrayList<Pair>> ar){
        visited[node]=true;
        path[node]=true;
        wt[node]=cwt;
        for(Pair p:ar.get(node)){
            int i=p.v;
            int wgt=p.wt;
            if(!visited[i]){
                if(dfs(i,cwt+wgt,path,visited,wt,ar)) return true;
            }
            else if(path[i]&&(cwt-wt[i]<0)) return true;
        }
        wt[node]=0;
        path[node]=false;
        return false;
        
    }
}
class Pair{
    int v;
    int wt;
    Pair(int v,int wt){
        this.v=v;
        this.wt=wt;
    }
}