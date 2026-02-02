// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int p=0;
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                p++;
               for(int k=j-1;k>i;k--){
                   if(arr[i]+arr[k]==target) p++;
               }
               i++;
            }
            else if(arr[i]+arr[j]>target) j--;
            else i++;
        }
        return p;
    }
}
