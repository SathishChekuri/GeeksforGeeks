class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        double a=0;
        int c=0;
        for(int i:arr){
            if(i>=0){
                a+=i;
                c++;
            }
        }
        return (double)a/c;
    }
}
