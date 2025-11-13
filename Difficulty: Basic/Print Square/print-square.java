// User function Template for Java
class Solution {
    public static void square(int s) {
        // Complete the code given belo
        String x="";
        char [][] ar=new char[s][s];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
            if(i==0||j==s-1||j==0||i==s-1) ar[i][j]='*';
            else ar[i][j]=' ';
        }
        }
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(j==s-1) {
                   x+=ar[i][j];
                }
                else x+=ar[i][j]+" ";
            }
            if(i==s-1) break;
            x+="\n";
        }
        System.out.println(x);
    }
}
