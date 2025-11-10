// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime numberin
        n++;
        while(true){
            int c=0;
            for(int i=2;i<n/2+1;i++){
                if(n%i==0){
                    c=1;
                    n++;
                    break;
                }
            }
            if(c==0) return n;
        }
        // return next prime number
    }
}