// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String s="";
        for(int j=S2.length()-1;j>=0;j--) s+=S2.charAt(j);
        for(int j=S1.length()-1;j>=0;j--) s+=S1.charAt(j);
        return s;
    }
}