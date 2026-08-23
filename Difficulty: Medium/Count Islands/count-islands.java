class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]&&grid[i][j]=='L'){
                    dfs(i,j,visited,grid);
                    c++;
                }
            }
        }
        return c;
    }
    void dfs(int r,int c,boolean [][] visited,char [][] grid){
        int n=visited.length;
        int m=visited[0].length;
        visited[r][c]=true;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                int nr=r+i;
                int nc=c+j;
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&!visited[nr][nc]&&grid[nr][nc]=='L'){
                    dfs(nr,nc,visited,grid);
                }
            }
        }
    }
}