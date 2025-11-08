// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        while(true){
            int t=++n;
            int c=0;
            if(t<2) t=2;
            for(int i=2;i<t/2+1;i++){
            if(t%i==0){
                c=1;
                break;
            }
             }
             if(c==0) return t;
        }
    }
}