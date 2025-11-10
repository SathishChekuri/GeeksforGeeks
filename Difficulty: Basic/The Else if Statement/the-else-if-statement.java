import java.util.*;

public class Solution {
    public static void solve() {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>100) System.out.print("Big");
        else if(n<10) System.out.print("Small");
        else System.out.print("Number");
    }
}