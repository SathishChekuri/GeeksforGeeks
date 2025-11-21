class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i:arr){
            if(i<target) ar.add(i);
        }
        return ar;
    }
}