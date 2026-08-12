class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        boolean [] visited=new boolean[adj.size()];
        dfs(0,visited,adj,ans);
        return ans;
    }
    void dfs(int node,boolean[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
        ans.add(node);
        visited[node]=true;
        for(int i:adj.get(node)){
            if(!visited[i]){
                dfs(i,visited,adj,ans);
            }
        }
    }
}