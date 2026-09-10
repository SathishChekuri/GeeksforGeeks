class Solution {
    public int pairCount(int x, int y) {
        if(y % x != 0)
            return 0;

        int c = 0;

        for(int i = x; i <= y; i += x) {
            if(y % i == 0) {
                int j = (x * y) / i;

                if(gcd(i, j) == x)
                    c++;
            }
        }

        return c;
    }

    int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}