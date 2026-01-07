class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        int i=0;
        int mx=arr.get(i);
        for(i=1;i<arr.size();i++){
            if(mx<arr.get(i)) mx=arr.get(i);
        }
        return mx;
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        
        // Your code here
        int i=0;
        int mn=arr.get(i);
        for(i=1;i<arr.size();i++){
            if(mn>arr.get(i)) mn=arr.get(i);
        }
        return mn;
    }
}
