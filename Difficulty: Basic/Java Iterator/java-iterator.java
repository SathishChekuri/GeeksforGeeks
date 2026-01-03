
import java.util.*;
class Solution {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i:arr){
            if(i>=k) ar.add(i);
        }
        return ar;
    }
};