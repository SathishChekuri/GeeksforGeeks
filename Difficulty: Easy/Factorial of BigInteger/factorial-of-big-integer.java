import java.math.BigInteger;
class Solution {
    public static BigInteger factorial(int n) {
        // code here
        BigInteger f=new BigInteger("1");
        for(int i=2;i<=n;i++){
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
