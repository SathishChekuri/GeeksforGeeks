class Solution {
    public int maxDiffSum(int[] arr) {
        // code here
         int n = arr.length;

         long dp0 = 0;
         long dp1 = 0;

         int prev0 = arr[0];
         int prev1 = 1;

         for (int i = 1; i < n; i++) {
             int x = arr[i];

             long newDp0 = Math.max(
                 dp0 + Math.abs(prev0 - x),
                 dp1 + Math.abs(prev1 - x)
             );

             long newDp1 = Math.max(
                 dp0 + Math.abs(prev0 - 1),
                 dp1 + Math.abs(prev1 - 1)
             );

             dp0 = newDp0;
             dp1 = newDp1;

             prev0 = x;
             prev1 = 1;
         }

         return (int)Math.max(dp0, dp1);
     }
 }