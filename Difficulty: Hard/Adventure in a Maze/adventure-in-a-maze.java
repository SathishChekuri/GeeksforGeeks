class Solution {
    public ArrayList<Integer> findWays(int[][] grid) {
        // Code here
        int n=grid.length;
        int MOD=1000000007;

        long[][] ways=new long[n][n];
        int[][] best=new int[n][n];

        ways[0][0]=1;
        best[0][0]=grid[0][0];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i==0&&j==0)
                    continue;

                // From top
                if(i>0&&ways[i-1][j]>0&&
                   (grid[i-1][j]==2||grid[i-1][j]==3)){

                    ways[i][j]=(ways[i][j]+ways[i-1][j])%MOD;

                    best[i][j]=Math.max(
                        best[i][j],
                        best[i-1][j]+grid[i][j]
                    );
                }

                // From left
                if(j>0&&ways[i][j-1]>0&&
                   (grid[i][j-1]==1||grid[i][j-1]==3)){

                    ways[i][j]=(ways[i][j]+ways[i][j-1])%MOD;

                    best[i][j]=Math.max(
                        best[i][j],
                        best[i][j-1]+grid[i][j]
                    );
                }
            }
        }

        ArrayList<Integer> ans=new ArrayList<>();

        ans.add((int)ways[n-1][n-1]);

        if(ways[n-1][n-1]==0)
            ans.add(0);
        else
            ans.add(best[n-1][n-1]);

        return ans;
    }
}