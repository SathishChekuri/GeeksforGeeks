// User function Template for Java
class Solution {
    public static int nFactorial(int n) {
        if(n==0) return 1;
        int ans = 1;

        // Write your code here
        for(int i=2;i<=n;i++) ans*=i;

        return ans;
    }
}