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
        Queue<Integer> q=new LinkedList<>();
        int [] Indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int j:ar.get(i)) Indegree[j]++;
        }
        int c=0;
        for(int i=0;i<V;i++){
            if(Indegree[i]==0){
                q.add(i);
                c++;
            }
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int i:ar.get(curr)){
                Indegree[i]--;
                if(Indegree[i]==0){
                    q.add(i);
                    c++;
                }
            }
        }
        return c!=V;
    }
   
}