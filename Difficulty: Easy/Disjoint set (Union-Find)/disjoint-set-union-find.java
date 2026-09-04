class Solution {
    public ArrayList<Integer> DSU(int n, int[][] queries) {
        // code here
         int parent[]=new int[n+1];
         int rank[]=new int[n+1];
         for(int i=1;i<=n;i++){
             parent[i]=i;
             rank[i]=0;
         }
         ArrayList<Integer> ans=new ArrayList<>();
         for(int arr[]:queries){
             int pa_x=find(arr[1],parent);
             if(arr[0]==2){
                 ans.add(pa_x);
                 continue;
             }
             int pa_z=find(arr[2],parent);
             parent[pa_x]=parent[pa_z];
             }
            return ans; 
    }
    int find(int node,int parent[]){
        if(parent[node]==node) return node;
        parent[node]=find(parent[node],parent);
        return parent[node];
    }
}
