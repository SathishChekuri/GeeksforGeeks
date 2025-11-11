class Solution {
    static String revStr(String s) {
        // code here
        StringBuilder s1=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}