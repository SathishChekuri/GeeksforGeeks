class Solution {
    public int shortestPath(int V, int[][] edges, int src, int dest) {
        // code here
        int [] dist=new int[V];
        for(int i=0;i<V;i++) dist[i]=(int)10e9;
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<V;i++) ar.add(new ArrayList<>());
        for(int arr[]:edges){
            ar.get(arr[0]).add(arr[1]);
            ar.get(arr[1]).add(arr[0]);
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,0));
        dist[src]=0;
        while(!q.isEmpty()){
            Pair temp=q.poll();
            int node=temp.node;
            int wt=temp.wt;
            for(int i:ar.get(node)){
                if(dist[i]>wt+1){
                    dist[i]=wt+1;
                    q.add(new Pair(i,wt+1));
                }
            }
        }
        return (dist[dest]==(int)10e9)?-1:dist[dest];
    }
    
}
class Pair{
    int node;
    int wt;
    Pair(int node,int wt){
        this.node=node;
        this.wt=wt;
    }
}