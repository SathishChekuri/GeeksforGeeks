class Solution {
    public int palindromicStrings(int n, int k) {
        // code her
                long MOD = 1000000007L;
                long ans = 0;

                for (int len = 1; len <= n; len++) {
                    int pairs = len / 2;

                    if (pairs > k)
                        continue;

                    long ways = 1;

                    for (int j = 0; j < pairs; j++) {
                        ways = (ways * (k - j)) % MOD;
                    }

                    if (len % 2 == 0) {
                        ans = (ans + ways) % MOD;
                    } else {
                        ways = (ways * (k - pairs)) % MOD;
                        ans = (ans + ways) % MOD;
                    }
                }

                return (int) ans;
            }
        }