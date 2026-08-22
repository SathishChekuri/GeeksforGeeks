class Solution {
    public int countDistinctIslands(char[][] grid) {
        // code here
        int n=grid.length;
        int m=grid[0].length;
        HashSet<String>  hs=new HashSet<>();
        boolean [][]visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='L'&&!visited[i][j]) hs.add(dfs(i,j,i,j,visited,grid).toString());
            }
        }
        return hs.size();
    }
    StringBuilder dfs(int r,int c,int r1,int c1,boolean [][]visited,char [][]grid){
        visited[r][c]=true;
        int n=grid.length,m=grid[0].length;
        StringBuilder sb=new StringBuilder();
       sb.append((r-r1)).append("#").append(c-c1).append(",");
        int dr[]=new int[]{-1,0,1,0};
        int dc[]=new int[]{0,1,0,-1};
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0&&nr<n&&nc>=0&&nc<m&&!visited[nr][nc]&&grid[nr][nc]=='L'){
                sb.append(dfs(nr,nc,r1,c1,visited,grid));
            }
        }
        return sb;
    }
}