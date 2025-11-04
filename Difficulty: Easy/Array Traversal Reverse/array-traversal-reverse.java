class Solution {
    public static void arrayTraversalReverse(int[] arr) {
        // Code here
        for(int i=arr.length-1;i>=0;i--){
            if(i==0){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
