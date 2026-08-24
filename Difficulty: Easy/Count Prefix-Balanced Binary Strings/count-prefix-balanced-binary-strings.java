class Solution {
     static final long MOD = 1000000007;
    public int prefixStrings(int n) {
        // code her
                long[] dp = new long[n + 1];

                dp[0] = 1;

                for (int i = 1; i <= n; i++) {

                    dp[i] = dp[i - 1];

                    dp[i] = dp[i] * (2L * (2 * i - 1)) % MOD;

                    dp[i] = dp[i] * modInverse(i + 1) % MOD;
                }

                return (int) dp[n];
            }

            long modInverse(long x) {
                return power(x, MOD - 2);
            }

            long power(long a, long b) {

                long result = 1;

                while (b > 0) {

                    if ((b & 1) == 1)
                        result = result * a % MOD;

                    a = a * a % MOD;
                    b >>= 1;
                }

                return result;
            }
        }