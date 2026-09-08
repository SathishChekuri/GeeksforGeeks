class Solution {
    static int t=1;
    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<V;i++) ar.add(new ArrayList<>());
        for(int [] arr:edges){
            ar.get(arr[0]).add(arr[1]);
            ar.get(arr[1]).add(arr[0]);
        }
        int [] ct=new int[V];
        int [] lt=new int[V];
        int [] mark=new int[V];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
        if(ct[i]==0) dfs(i,-1,ar,ct,lt,mark);
        }
        for(int i=0;i<V;i++) if(mark[i]==1) ans.add(i);
        if(ans.size()==0) ans.add(-1);
        return ans;
    }
    static void dfs(int curr,int parent,ArrayList<ArrayList<Integer>> ar,int [] ct,int [] lt,int mark[]){
        ct[curr]=lt[curr]=t++;
        int child=0;
        for(int i:ar.get(curr)){
            if(i==parent) continue;
            if(ct[i]!=0){
                lt[curr]=Math.min(lt[curr],ct[i]);
                continue;
            }
            child++;
            dfs(i,curr,ar,ct,lt,mark);
            lt[curr]=Math.min(lt[curr],lt[i]);
            if(lt[i]>=ct[curr]&& parent!=-1) mark[curr]=1;
        }
        if(child>1&&parent==-1) mark[curr]=1;
    }
}