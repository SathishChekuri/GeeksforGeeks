class Solution {
    public int maxStackHeight(int[] r, int[] h) {
        // code here
           int n = r.length;

                int[][] discs = new int[n][2];

                for(int i = 0; i < n; i++) {
                    discs[i][0] = r[i];
                    discs[i][1] = h[i];
                }

                Arrays.sort(discs, (a, b) -> {
                    if(a[0] != b[0])
                        return Integer.compare(a[0], b[0]);
                    return Integer.compare(a[1], b[1]);
                });

                int[] bit = new int[1002];
                int ans = 0;

                int i = 0;

                while(i < n) {
                    int j = i;

                    while(j < n && discs[j][0] == discs[i][0])
                        j++;

                    int[] dp = new int[j - i];

                    for(int p = i; p < j; p++) {
                        int height = discs[p][1];

                        dp[p - i] = height + query(bit, height - 1);

                        ans = Math.max(ans, dp[p - i]);
                    }

                    for(int p = i; p < j; p++) {
                        update(bit, discs[p][1], dp[p - i]);
                    }

                    i = j;
                }

                return ans;
            }

            int query(int[] bit, int idx) {
                int ans = 0;

                while(idx > 0) {
                    ans = Math.max(ans, bit[idx]);
                    idx -= idx & -idx;
                }

                return ans;
            }

            void update(int[] bit, int idx, int value) {
                while(idx < bit.length) {
                    bit[idx] = Math.max(bit[idx], value);
                    idx += idx & -idx;
                }
            }
        }