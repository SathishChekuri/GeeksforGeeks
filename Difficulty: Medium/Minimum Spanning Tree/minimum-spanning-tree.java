class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Pair>> ar=new ArrayList<>();
        for(int i=0;i<V;i++){
            ar.add(new ArrayList<>());
        }
        int cost=0;
        for(int arr[]:edges){
            ar.get(arr[0]).add(new Pair(arr[1],arr[2]));
            ar.get(arr[1]).add(new Pair(arr[0],arr[2]));
        }
        boolean visited[]=new boolean [V];
        PriorityQueue<Pair> pr=new PriorityQueue<>((x,y)->Integer.compare(x.wt,y.wt));
        pr.add(new Pair(0,0));
        while(!pr.isEmpty()){
            Pair curr=pr.poll();
            int node=curr.node;
            int wt=curr.wt;
            if(visited[node]) continue;
             cost+=wt;
            visited[node]=true;
            for(Pair p:ar.get(node)){
                if(!visited[p.node]){
                    pr.add(new Pair(p.node,p.wt));
                }
            }
        }
        return cost;
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
