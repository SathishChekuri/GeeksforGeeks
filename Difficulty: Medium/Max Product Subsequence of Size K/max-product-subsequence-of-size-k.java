class Solution {
    public long maxProduct(int[] arr, int k) {
        int n = arr.length;

        long[][] max = new long[n + 1][k + 1];
        long[][] min = new long[n + 1][k + 1];

        boolean[][] valid = new boolean[n + 1][k + 1];

        valid[0][0] = true;
        max[0][0] = min[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            valid[i][0] = true;
            max[i][0] = min[i][0] = 1;

            for (int j = 1; j <= Math.min(i, k); j++) {
                if (valid[i - 1][j]) {
                    max[i][j] = max[i - 1][j];
                    min[i][j] = min[i - 1][j];
                    valid[i][j] = true;
                }

                if (valid[i - 1][j - 1]) {
                    long x = arr[i - 1];

                    long a = x * max[i - 1][j - 1];
                    long b = x * min[i - 1][j - 1];

                    if (!valid[i][j]) {
                        max[i][j] = Math.max(a, b);
                        min[i][j] = Math.min(a, b);
                        valid[i][j] = true;
                    } else {
                        max[i][j] = Math.max(max[i][j], Math.max(a, b));
                        min[i][j] = Math.min(min[i][j], Math.min(a, b));
                    }
                }
            }
        }

        return max[n][k];
    }
}