class Solution {
    public void printPattern(int n) {
        //if(n>0) System.out.print
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              if(j==1||i==n) System.out.print("* ");
              else if(j==i) System.out.print("*");
              else System.out.print("  ");
            }
            System.out.println();
        }
    }
}