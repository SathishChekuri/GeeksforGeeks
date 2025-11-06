// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        for(int i=0;i<s.length();i++){
            if((s.substring(0,i)).contains(s.charAt(i)+"")) return s.charAt(i)+"";
        }
        return -1+"";
    }
}