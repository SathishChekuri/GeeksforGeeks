import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        int t;
        for(int i=0;i<n-2;i++){
            t=a+b;
            b=a;
            a=t;
        }
        System.out.print(a);
    }
}