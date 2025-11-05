import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        // Your Code Here
        int n=sc.nextInt();
        while(n>=0){
            if(n==0){
                System.out.print(n);
                break;
            }
            System.out.print((n--)+" ");
        }
    }
}