class Solution {
    public int countSCC(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        ArrayList<ArrayList<Integer>> rev=new ArrayList<>();
        for(int i=0;i<V;i++){
             ar.add(new ArrayList<>());
             rev.add(new ArrayList<>());
        }
        for(int arr[]:edges){
            ar.get(arr[0]).add(arr[1]);
            rev.get(arr[1]).add(arr[0]);
        }
        Stack <Integer> st=new Stack<>();
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,visited,ar,st);
            }
        }
       // System.out.println(st.toString());
         int c=0;
         boolean visited1[]=new boolean[V];
        while(!st.isEmpty()){
            int i=st.pop();
            if(!visited1[i]){
                c++;
                dfs(i,visited1,rev);
            }
        }
        return c;
    }
    void dfs(int i,boolean [] visited,ArrayList<ArrayList<Integer>> ar){
        visited[i]=true;
        for(int j:ar.get(i)){
            if(!visited[j]) dfs(j,visited,ar);
        }
    }
    void dfs(int i,boolean [] visited,ArrayList<ArrayList<Integer>> ar,Stack<Integer> st){
        visited[i]=true;
        for(int j:ar.get(i)){
            if(!visited[j]) dfs(j,visited,ar,st);
        }
         st.push(i);
    }
}