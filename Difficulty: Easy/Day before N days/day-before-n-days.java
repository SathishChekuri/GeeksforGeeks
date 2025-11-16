class Solution {
    public int dayBefore(int d, int n) {
        // code here
        n=n%7;
        return (d-n<0)?d-n+7:d-n;
    }
}