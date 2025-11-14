class Solution {
    public static void arrayTraversal(int[] arr) {
        // Code here
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[arr.length-1]);
    }
}
