//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        int c=0;
        while(a>0){
            a/=10;
            c++;
        }
        System.out.print(a);
    }
}