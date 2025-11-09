// User function Template for Java
class Solution {
    public static int LCM(int a, int b) {
         int prd=a*b;
         while(b>0){
             int t=a%b;
             a=b;
             b=t;
         }
         return prd/a;
        // write your code here
        

        // return LCM of a and b
    }
}