class Solution {
    public int maxTask(int[] h, int[] l) {
        // code here
        int dp[]=new int[h.length+1];
        dp[1]=Math.max(h[0],l[0]);
        for(int i=2;i<=h.length;i++){
            dp[i]=Math.max(dp[i-1]+l[i-1],dp[i-2]+h[i-1]);
        }
        return dp[h.length];
    }
}