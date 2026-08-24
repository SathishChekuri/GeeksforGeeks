class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<V;i++) ar.add(new ArrayList<Integer>());
        for(int [] arr:edges){
            ar.get(arr[0]).add(arr[1]);
        }
        boolean [] visited=new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,st,visited,ar);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!st.isEmpty()) ans.add(st.pop());
        return ans;
    }
    void dfs(int vertex,Stack<Integer> st,boolean [] visited,ArrayList<ArrayList<Integer>> ar){
        visited[vertex]=true;
        for(int i:ar.get(vertex)){
            if(!visited[i])  dfs(i,st,visited,ar);
        }
        st.push(vertex);
    }
}