class Solution {
    public int zigzagSequence(int[][] mat) {
        // code here
        int n=mat.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++) dp[0][i]=mat[0][i];
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int mx=0;
                for(int k=0;k<n;k++){
                    if(j==k) continue;
                    mx=Math.max(mx,dp[i-1][k]);
                }
                dp[i][j]=mat[i][j]+mx;
            }
        }
        int mx=0;
        for(int i=0;i<n;i++) mx=Math.max(dp[n-1][i],mx);
        return mx;
    }
}