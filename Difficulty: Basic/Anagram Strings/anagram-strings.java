// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        int ar[]=new int[26];
        for(char c:S1.toCharArray()) ar[c-'a']+=1;
        for(char c:S2.toCharArray()) ar[c-'a']-=1;
        for(char c:S1.toCharArray()){
            if(ar[c-'a']!=0) return 0;
        }
        return 1;
    }
}