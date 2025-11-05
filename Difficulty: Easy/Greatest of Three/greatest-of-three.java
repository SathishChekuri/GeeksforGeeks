//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your code here
        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();
        int b=cs.nextInt();
        int c=cs.nextInt();
        if(a>b&&a>c) System.out.print(a);
        else if(b>c) System.out.print(b);
        else System.out.print(c);
    }
}