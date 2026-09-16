class Solution {
    public int dominantPairs(int[] arr) {
        int n=arr.length;
        int left[]=new int[n/2];
        int right[]=new int[n/2];
        for(int i=0;i<n/2;i++){
            // left[i]=arr[i];
            right[i]=arr[n/2+i];
        }
        // Arrays.sort(left);
        Arrays.sort(right);
        // Code here
        int c=0;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n/2;j++){
                if(5*right[j]<=arr[i]) c++;
                else break;
            }
        }
        return c;
    }
}