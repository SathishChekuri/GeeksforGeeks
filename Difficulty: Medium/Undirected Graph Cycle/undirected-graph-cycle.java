class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> ar=new ArrayList<>();
        for(int i=0;i<V;i++){
            ar.add(new ArrayList<>());
        }
        for(int [] arr: edges){
            ar.get(arr[0]).add(arr[1]);
            ar.get(arr[1]).add(arr[0]);
        }
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(bfs(i,-1,ar,visited)) return true;
            }
        }
        return false;
    }
    boolean bfs(int node,int parent,List<List<Integer>> ar,boolean [] visited){
        visited[node]=true;
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(node,parent));
        while(!q.isEmpty()){
            Node temp=q.poll();
            int curr=temp.node;
            int prnt=temp.parent;
            for(int i:ar.get(curr)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(new Node(i,curr));
                }
                else if(i!=prnt){
                    return true;
                }
            }
        }
        return false;
    }
}
class Node{
    int node;
    int parent;
    Node(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}
