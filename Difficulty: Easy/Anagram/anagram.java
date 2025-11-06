class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        int ar[]=new int[26];
        for(char c:s1.toCharArray()) ar[c-'a']++;
        for(char c:s2.toCharArray()) ar[c-'a']--;
        for(char c:s1.toCharArray()) {
            if(ar[c-'a']!=0) return false;
        }
        return true;
    }
}