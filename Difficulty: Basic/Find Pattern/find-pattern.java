class Solution {
    public static int findPattern(String s, String p) {
        // code here
        if(!s.contains(p)) return -1;
        else return s.indexOf(p);
    }
}
