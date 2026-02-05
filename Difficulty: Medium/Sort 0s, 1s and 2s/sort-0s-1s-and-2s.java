class Solution {
    public void sort012(int[] arr) {
        // code here
        int i=0,j=0,k=arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j++;
            }
            else if(arr[j]==2){
                int t=arr[k];
                arr[k]=arr[j];
                arr[j]=t;
                k--;
            }
            else j++;
        }
    }
}