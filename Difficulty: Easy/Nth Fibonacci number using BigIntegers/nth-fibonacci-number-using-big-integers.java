import java.math.BigInteger;

class Solution {
    public static BigInteger fib(int n) {
        // code here
        BigInteger a=new BigInteger("1");
        BigInteger b=new BigInteger("1");
        BigInteger c=a;
        if(n<=1) return a;
        for(int i=2;i<n;i++){
            c=a.add(b);
            a=b;
            b=c;
        }
        return c;
    }
}