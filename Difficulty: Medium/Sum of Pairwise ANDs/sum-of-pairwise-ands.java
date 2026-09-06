class Solution {
    public long pairAndSum(int[] arr) {
        long sum = 0;
        int n = arr.length;

        for(int bit = 0; bit < 31; bit++) {
            long cnt = 0;

            for(int x : arr) {
                if((x & (1 << bit)) != 0) {
                    cnt++;
                }
            }

            sum += cnt * (cnt - 1) / 2 * (1L << bit);
        }

        return sum;
    }
}