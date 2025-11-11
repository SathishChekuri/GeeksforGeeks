import java.text.DecimalFormat;
class Solution {
    public String average(int arr[]) {
        // code here
        int s=0;
        for(int i:arr) s+=i;
        //DecimalFormat d=new DecimalFormat(0.00);
        double avg=(double)s/arr.length;
        String r=String.format("%.2f",avg);
        return r;
    }
}