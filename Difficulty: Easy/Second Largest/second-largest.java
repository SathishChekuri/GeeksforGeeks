class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int s1=Integer.MIN_VALUE,s2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>s1){
                s2=s1;
                s1=arr[i];
            }
            else if(arr[i]>s2&&arr[i]!=s1) s2=arr[i];
        }
        return (s2==Integer.MAX_VALUE)?-1:s2;
    }
}