class Solution {
    public ArrayList<Integer> bellmanFord(int V, int[][] edges, int src) {
        // code here
        int dist[]=new int[V];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++) dist[i]=(int)1e8;
         dist[src]=0;;
        for(int i=0;i<=V;i++){
            for(int [] arr:edges){
                int v=arr[0];
                int u=arr[1];
                int wt=arr[2];
                if(dist[v]!=(int)1e8&&dist[v]+wt<dist[u]){
                    if(i==V){
                        ans.add(-1);
                        return ans;
                    }
                    dist[u]=wt+dist[v];
                }
            }
        }
        for(int i:dist) ans.add(i);
        return ans;
    }
}
