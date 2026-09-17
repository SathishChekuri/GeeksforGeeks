class Solution {
    public int minimumEdgeReversal(int[][] edges, int n, int src, int dst) {
        // code here
        ArrayList<ArrayList<Node>> ar=new ArrayList<>();
        for(int i=0;i<=n;i++){
            ar.add(new ArrayList<>());
        }
        for(int [] arr:edges){
            ar.get(arr[0]).add(new Node(arr[1],0));
            ar.get(arr[1]).add(new Node(arr[0],1));
        }
        boolean [] visited=new boolean[n+1];
        // visited[src]=true;
        PriorityQueue<Node> pr=new PriorityQueue<>((x,y)->Integer.compare(x.c,y.c));
        pr.add(new Node(src,0));
        while(!pr.isEmpty()){
            Node curr=pr.poll();
            int node=curr.v;
            int wt=curr.c;
            if(visited[node]) continue;
            visited[node]=true;
            if(node==dst) return wt;
            for(Node next:ar.get(node)){
                if(!visited[next.v]){
                    pr.add(new Node(next.v,wt+next.c));
                    
                }
            }
        }
        return -1;
    }
}
class Node{
    int c;
    int v;
    Node(int v,int c){
        this.v=v;
        this.c=c;
    }
}