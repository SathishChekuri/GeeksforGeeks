// User function Template for Java
import java.util.*;
class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        ArrayList<Integer> ar=new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int c=0;
        for(int i=0;i<b.length;i++){
            for(int j=c;j<a.length;j++){
                if(a[j]>b[i]) break;
                if(b[i]==a[j]){
                     ar.add(b[i]);
                     c=j+1;
                     break;
            }
        }
    }
    return ar;
}
}