// User function Template for Java

class Solution {
    public int findMin(int a, int b) {
        // Your code here
        int s1=a+b;
        int s2=a-b;
        int s3=a*b;
        int s4=Integer.MAX_VALUE;
        try{
            s4=a/b;
        }
        catch(Exception e){
        }
        return Math.min(Math.min(s1,s2),Math.min(s3,s4));
    }
}