import java.util.*;
class Solution {
    public int maxArea(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[] height = new int[m];

        int ans = 0;

        for (int i = 0; i < n; i++) {

            // Build heights
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 1)
                    height[j]++;
                else
                    height[j] = 0;
            }

            // Sort heights
            Integer curr[]=new Integer[m];
            for(int j=0;j<m;j++){
                curr[j]=height[j];
            }
            Arrays.sort(curr,Collections.reverseOrder());

            // Find maximum rectangle
            for (int j = 0; j < m; j++) {

                ans = Math.max(ans, curr[j] * (j+1));
            }
        }

        return ans;
    }
}