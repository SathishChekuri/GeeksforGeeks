class Solution {
    public ArrayList<Integer> safeNodes(int V, int[][] edges) {
        // Code here
        //using bfs khans algorithm
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        int [] Indegree=new int[V];
        for(int i=0;i<V;i++) ar.add(new ArrayList<>());
        for(int arr[]:edges){
            ar.get(arr[1]).add(arr[0]);
            Indegree[arr[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(Indegree[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int c=q.poll();
             ans.add(c);
            for(int i:ar.get(c)){
                Indegree[i]--;
                if(Indegree[i]==0) q.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}