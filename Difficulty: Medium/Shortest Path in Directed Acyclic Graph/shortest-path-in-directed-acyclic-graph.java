class Solution {
    public ArrayList<Integer> shortestPath(int V, int[][] edges) {
        // Code here
        int [] wt=new int[V];
        for(int i=0;i<V;i++) wt[i]=(int)10e9;
        ArrayList<ArrayList<Pair>> ar=new ArrayList<>();
        for(int i=0;i<V;i++) ar.add(new ArrayList<>());
        for(int [] arr:edges){
            ar.get(arr[0]).add(new Pair(arr[1],arr[2]));
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,0));
        wt[0]=0;
        while(!q.isEmpty()){
            Pair temp=q.poll();
            int node=temp.node;
            int w=temp.wt;
            for(Pair t:ar.get(node)){
                if(wt[t.node]>w+t.wt){
                    wt[t.node]=w+t.wt;
                    q.add(new Pair(t.node,wt[t.node]));
                }
            }
            }
             ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(wt[i]==(int)10e9) wt[i]=-1;
            ans.add(wt[i]);
        }
       
        
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