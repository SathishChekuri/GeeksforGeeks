class Solution {
    public int minMoves(int[] arr) {
        // code here
        int pos[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            pos[arr[i]]=i;
        }
        int c=1,mx=1;
        for(int i=1;i<arr.length;i++){
            if(pos[i]<pos[i+1]){
                c++;
            }
            else c=1;
             mx=Math.max(c,mx);
        }
        return arr.length-mx;
    }
}