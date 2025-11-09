class Solution {
    void printDivisors(int n) {
        // code here
        for(int i=1;i<n;i++){
            if(n%i==0) System.out.print(i+" ");
        }
        if(n>0) System.out.print(n);
    }
}