class Solution {
    public ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        for(int k=0;k<rank.length;k++){
            //int rnk=rank[k];
            int count=rank[k];
        for(int i=0;i<r.length;i++){
            int c=r[i]-l[i]+1;
            if(c>=count){
                ar.add(l[i]+count-1);
                break;
            }
            else count-=c;
        }
        }
        return ar;
    }
}