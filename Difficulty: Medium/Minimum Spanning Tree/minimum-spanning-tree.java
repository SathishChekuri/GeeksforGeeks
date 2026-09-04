class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        int parent[]=new int[V];
        int rank[]=new int[V];
        for(int i=0;i<V;i++){
           parent[i]=i;
           rank[i]=0;
        }
        int cost=0;
         ArrayList<Pair> ar=new ArrayList<>();
        for(int arr[]:edges){
            ar.add(new Pair(arr[0],arr[1],arr[2]));
        }
        ar.sort((x,y)->Integer.compare(x.wt,y.wt));
        for(Pair p:ar){
            int pa_u=find(p.u,parent);
            int pa_v=find(p.v,parent);
            if(pa_u==pa_v) continue;
            cost+=p.wt;
            if(rank[pa_u]>rank[pa_v]) parent[pa_v]=pa_u;
            else if(rank[pa_v]>rank[pa_u]) parent[pa_u]=pa_v;
            else{
                rank[pa_u]++;
                parent[pa_v]=pa_u;
            }
        }
        return cost;
    }
    int find(int node,int [] parent){
        if(node==parent[node]) return node;
        parent[node]=find(parent[node],parent);
        return parent[node];
    }
}
class Pair{
    int u;
    int v;
    int wt;
    Pair(int u,int v,int wt){
        this.u=u;
        this.v=v;
        this.wt=wt;
    }
}
