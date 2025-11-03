import java.util.*;

public class Solution {
    public static void solve() {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(1*n);
        for(int i=2;i<11;i++) System.out.print(" "+i*n);
    }
}