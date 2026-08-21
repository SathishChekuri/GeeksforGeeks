class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        // code hereint 
        int n=grid.length;
        int m=grid[0].length;
        boolean [][]visited=new boolean[n][m];
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    visited[i][j]=true;
                    q.add(new Node(i,j,0));
                    arr.add(0);
                }
                else arr.add(1);
            }
            ar.add(arr);
        }
        int dr[]=new int[]{-1,0,1,0};
        int dc[]=new int[]{0,1,0,-1};
        while(!q.isEmpty()){
            Node temp=q.poll();
            int r=temp.r;
            int c=temp.c;
            int t=temp.t;
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&!visited[nr][nc]){
                    ar.get(nr).set(nc,t+1);
                    visited[nr][nc]=true;
                    q.add(new Node(nr,nc,t+1));
                }
            } 
        }
        return ar;
    }
}
class Node{
    int r;
    int c;
    int t;
    Node(int r,int c,int t){
        this.r=r;
        this.c=c;
        this.t=t;
    }
}