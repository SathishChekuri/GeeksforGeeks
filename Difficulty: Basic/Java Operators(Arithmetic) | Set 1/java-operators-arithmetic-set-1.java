
class Solution {
    public double[] FindRoots(int A, int B, int C) {
        // code here
        if((Math.pow(B,2)-4*A*C)<0) {
            double [] a=new double[1];
            a[0]=-1;
            return a;
        }
        double [] a=new double[2];
        double a1=(-B+Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
        double b=(-B-Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
        a[0]=(a1<=b)?a1:b;
        a[1]=(a[0]==a1)?b:a1;
        return a;
    }
}