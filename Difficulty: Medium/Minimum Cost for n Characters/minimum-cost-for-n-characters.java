class Solution {
	public int minCost(int n, int i, int d, int c) {
		
		int[] dp = new int[n + 1];
		
		dp[0] = 0;
		
		for (int x = 1; x <= n; x++) {
		
			dp[x] = dp[x - 1] + i;
		
			if (x % 2 == 0) {
				dp[x] = Math.min(dp[x],
				dp[x / 2] + c);
			}
			if (x > 1 && x % 2 == 1) {
				dp[x] = Math.min(dp[x],
				dp[(x + 1) / 2] + c + d);
			}
		}
		
		return dp[n];
	}
}
