class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int xor = 0;

        for (int i = queries.length - 1; i >= 0; i--) {
            int type = queries[i][0];
            int x = queries[i][1];

            if (type == 0) {
                res.add(x ^ xor);
            } else {
                xor ^= x;
            }
        }

        res.add(xor); // initial 0 becomes 0 ^ xor

        Collections.sort(res);
        return res;
    }
}