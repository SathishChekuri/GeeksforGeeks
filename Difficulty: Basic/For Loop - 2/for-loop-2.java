class Solution {
    public void printEvenIndices(String s) {
        // code here
        String r="";
        for(int i=0;i<s.length();i++){
            if(i%2==0) r+=s.charAt(i);
        }
        System.out.print(r);
    }
}