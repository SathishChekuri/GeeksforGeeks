class Solution {
    public int findMax(int n) {
        int ans = n;
        int p = 1;

        while(n / p > 0) {
            int x = (n / p) * p - 1;

            if(x > 0 && digitSum(x) > digitSum(ans))
                ans = x;

            p *= 10;
        }

        return ans;
    }

    int digitSum(int n) {
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}