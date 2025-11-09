// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int [] ar=new int[26];
        for(int i=0;i<s2.length();i++){
            ar[s2.charAt(i)-'a']++;
        }
        for(int j=0;j<s1.length();j++){
            ar[s1.charAt(j)-'a']--;    
        }
        for(int i=0;i<s2.length();i++){
            if(ar[s2.charAt(i)-'a']!=0) return s2.charAt(i);
        }
        return 'a';
    }
}
