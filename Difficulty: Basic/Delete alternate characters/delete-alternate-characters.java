// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        StringBuilder s1=new StringBuilder(S);
        for(int i=S.length()-1;i>=0;i--){
            if(i%2==1) s1.deleteCharAt(i);
        }
        return s1.toString();
    }
}