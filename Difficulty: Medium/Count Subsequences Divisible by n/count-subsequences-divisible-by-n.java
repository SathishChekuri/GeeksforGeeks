class Solution {
    public int countSubsequences(String s, int n) {
        // code here
                long MOD = 1000000007L;
                long[] dp = new long[n];
                for (char ch : s.toCharArray()) {
                    int d = ch - '0';
                    // Copy old dp because we can choose not to take this digit
                    long[] next = dp.clone();
                    // Take this digit alone
                    next[d % n]++;
                    // Append this digit to every existing subsequence
                    for (int r = 0; r < n; r++) {
                        if (dp[r] == 0)
                            continue;
                        int newRem = (r * 10 + d) % n;
                        next[newRem] += dp[r];
                        if (next[newRem] >= MOD)
                            next[newRem] %= MOD;
                    }
                    dp = next;
                }
                return (int)(dp[0] % MOD);
    }
}