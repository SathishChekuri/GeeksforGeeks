class Solution {
    public int countDigits(int n) {
        // code here
        int c=0;
        if(n==0) return 1;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }
}
