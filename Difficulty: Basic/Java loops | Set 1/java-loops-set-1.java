// User function Template for Java
class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        int e=0,o=0;
        for(int i=1;i<=N;i++){
            if(i%2==0) e+=i;
            else o+=i;
        }
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(e);
        ar.add(o);
        return  ar;
    }
}