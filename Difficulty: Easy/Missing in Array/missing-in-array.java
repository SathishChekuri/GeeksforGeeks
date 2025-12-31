class Solution {
    int missingNum(int arr[]) {
        // code here
        long s=0;
        long n=arr.length+1;
        long sum=n*(n+1)/2;
        for(int i:arr) s+=i;
        return (int)(sum-s);
    }
}