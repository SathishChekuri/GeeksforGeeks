class Solution {
    public int shortestPath(int[][] mat, int[] src, int[] dest) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int dist[][]=new int[n][m];
        int mx=(int)1e9;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=mx;
            }
        }
        Queue<int []> q=new LinkedList<>();
        q.add(src);
        dist[src[0]][src[1]]=0;
        int dr[]=new int[]{-1,0,1,0};
        int dc[]=new int[]{0,1,0,-1};
        if(mat[src[0]][src[1]]==0) return -1;
        while(!q.isEmpty()){
            int [] temp=q.poll();
            int r=temp[0],c=temp[1];
            if(r==dest[0]&&c==dest[1]) return dist[r][c];
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&dist[nr][nc]==(int)1e9&&mat[nr][nc]==1){
                    dist[nr][nc]=dist[r][c]+1;
                    q.add(new int[]{nr,nc});
                }
            }
            
        }
        return -1;
    }
}