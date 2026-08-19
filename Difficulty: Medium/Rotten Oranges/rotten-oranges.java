class Solution {
    public int orangesRot(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        boolean visited[][]=new boolean[n][m];
        int cnt=0;
        Queue<rotten> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==2){
                    q.add(new rotten(i,j,0));
                    visited[i][j]=true;
                }
                else if(mat[i][j]==1) cnt++;
            }
        }
        int dr[]=new int[]{-1,0,1,0};
        int dc[]=new int[]{0,1,0,-1};
        int t=0;
        while(!q.isEmpty()){
            rotten temp=q.poll();
            int r=temp.r;
            int c=temp.c;
            t=temp.t;
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&mat[nr][nc]==1&&!visited[nr][nc]){
                q.add(new rotten(nr,nc,t+1));
                cnt--;
                visited[nr][nc]=true;
            }
            }
        }
        if(cnt!=0) return -1;
        return t;
    }
}
class rotten{
    int r;
    int c;
    int t;
    rotten(int r,int c,int t){
        this.r=r;
        this.c=c;
        this.t=t;
    }
}