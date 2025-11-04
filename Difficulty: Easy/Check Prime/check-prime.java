import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n/2+1;i++){
            if(n%i==0) {
                System.out.print("False");
                return ;
            }
        }
        System.out.print("True");
    }
}