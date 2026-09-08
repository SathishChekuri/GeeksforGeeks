class Solution {
    public ArrayList<ArrayList<Integer>> searchWord(char[][] mat, String word) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                boolean yes=false;
                if(mat[i][j]==word.charAt(0)){
                    for(int r=-1;r<=1;r++){
                        for(int c=-1;c<=1;c++){
                            if(r==0&&c==0) continue;
                            if(isIt(i+r,j+c,r,c,1,word,mat)){
                                ArrayList<Integer> temp=new ArrayList<>();
                                temp.add(i);
                                temp.add(j);
                                ans.add(temp);
                                yes=true;
                                break;
                            }
                        }
                        if(yes) break;
                    }
                }
            }
        }
        return ans;

    }
    boolean isIt(int r,int c,int dr,int dc,int ind,String s,char[][] mat){
        if(ind==s.length()) return true;
        int n=mat.length,m=mat[0].length;
        if((!(r>=0&&c>=0&&r<n&&c<m))||mat[r][c]!=s.charAt(ind)) return false;
        return isIt(r+dr,c+dc,dr,dc,ind+1,s,mat);
    }
}