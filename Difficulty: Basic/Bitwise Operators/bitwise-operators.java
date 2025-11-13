//Back-end complete function Template for Java
import java.util.Scanner;

public class Solution {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println((int)(a^a)+" "+(int)(~(c^b))+" "+(int)(a&b)+" "+(int)(c|(a^a)));
        // Perform all the operations and print in a single line
    }
}