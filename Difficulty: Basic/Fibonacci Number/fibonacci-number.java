class Solution {
    public static int fibonacci(int n) {
        // Write your code here to calculate
        // to calculate the nth fibonacci number
        int a=1;
        int b=1;
        int c=1;
        for(int i=0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
