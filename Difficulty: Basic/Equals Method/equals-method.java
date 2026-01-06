// User function Template for Java
class Solution {
    public static boolean areEqual(int a[], int b[]) {
        // Your code here
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}