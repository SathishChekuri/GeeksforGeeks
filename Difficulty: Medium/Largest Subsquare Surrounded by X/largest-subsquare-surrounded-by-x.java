class Solution {
    public int largestSubsquare(char mat[][]) {
        // code here
        int n = mat.length;

               int[][] right = new int[n][n];
               int[][] down = new int[n][n];

               for (int i = n - 1; i >= 0; i--) {
                   for (int j = n - 1; j >= 0; j--) {

                       if (mat[i][j] == 'X') {
                           right[i][j] = 1;
                           down[i][j] = 1;

                           if (j + 1 < n)
                               right[i][j] += right[i][j + 1];

                           if (i + 1 < n)
                               down[i][j] += down[i + 1][j];
                       }
                   }
               }

               for (int len = n; len >= 1; len--) {
                   for (int i = 0; i + len <= n; i++) {
                       for (int j = 0; j + len <= n; j++) {

                           int bottom = i + len - 1;
                           int rightCol = j + len - 1;

                           if (right[i][j] >= len &&
                               down[i][j] >= len &&
                               right[bottom][j] >= len &&
                               down[i][rightCol] >= len) {
                               return len;
                           }
                       }
                   }
               }

               return 0;
           }
       }