class Solution {
    ArrayList<Integer> largestSquare(int[][] mat, int[][] queries, int k) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int[][] pre=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                pre[i][j]=mat[i-1][j-1]
                        +pre[i-1][j]
                        +pre[i][j-1]
                        -pre[i-1][j-1];
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int[] q:queries){
            int r=q[0];
            int c=q[1];
            if(mat[r][c]>k){
                ans.add(-1);
                continue;
            }
            int low=0;
            int high=Math.min(
                Math.min(r,n-1-r),
                Math.min(c,m-1-c)
            );
            int best=0;
            while(low<=high){
                int mid=(low+high)/2;
                int r1=r-mid;
                int c1=c-mid;
                int r2=r+mid;
                int c2=c+mid;

                int ones=pre[r2+1][c2+1]
                        -pre[r1][c2+1]
                        -pre[r2+1][c1]
                        +pre[r1][c1];

                if(ones<=k){
                    best=mid;
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            ans.add(2*best+1);
        }
        return ans;
    }
}