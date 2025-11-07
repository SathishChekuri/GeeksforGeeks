// User function Template for Java
class Solution {
    public static int LCM(int a, int b) {

        // write your code here
        int prd=a*b;
        while(b>0){
            int t=a%b;
            a=b;
            b=t;
        }
        return prd/a;
        // return LCM of a and b
    }
}