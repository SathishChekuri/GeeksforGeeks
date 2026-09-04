class Solution {
    public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        // code here
        int dist[]=new int[V];
        ArrayList<ArrayList<Pair>> ar=new ArrayList<>();
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
            ar.add(new ArrayList<>());
        }
        for(int arr[]:edges){
            ar.get(arr[0]).add(new Pair(arr[1],arr[2]));
            ar.get(arr[1]).add(new Pair(arr[0],arr[2]));
        }
        boolean [] visited=new boolean[V];
        PriorityQueue<Pair> pr=new PriorityQueue<>((x,y)->Integer.compare(x.wt,y.wt));
        pr.add(new Pair(src,0));
        dist[src]=0;
        while(!pr.isEmpty()){
            Pair curr=pr.poll();
            int node=curr.node;
            if(visited[node]) continue;
            int wt=curr.wt;
            visited[node]=true;
            for(Pair p:ar.get(node)){
                if(!visited[p.node]&&dist[p.node]>wt+p.wt){
                    pr.add(new Pair(p.node,wt+p.wt));
                    dist[p.node]=p.wt+wt;
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:dist) ans.add(i);
        return ans;
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