class Solution {

    public int countTriplets(int[] arr, int l, int r) {
        // code here
        int c=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]<=r&&arr[i]+arr[j]+arr[k]>=l) c++;
                }
            }
        }
        return c;
    }
}