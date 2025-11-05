// User function Template for Java
class Solution {
    public static int gcd(int a, int b) {
         while(b!=0){
             int t=b;
             b=a%b;
             a=t;
         }
         return a;
        // code here to calculate and return gcd of a and b
    }
}