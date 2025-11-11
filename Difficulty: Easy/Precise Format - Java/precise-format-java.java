import java.util.*;
import java.text.DecimalFormat;
class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> an=new ArrayList<>();
        an.add(a/b);
        DecimalFormat df=new DecimalFormat("0.000");
        an.add(Float.parseFloat(df.format(a/b)));
        return an;
        
    }
}