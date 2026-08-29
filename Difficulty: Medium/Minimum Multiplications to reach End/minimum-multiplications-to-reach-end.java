class Solution {
    public int minSteps(int[] arr, int start, int end) {
        // code here
        // int MOD=1000;
        HashSet<Integer> hs=new HashSet<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(start,0));
        hs.add(start);
        while(!q.isEmpty()){
            Pair temp=q.poll();
            int curr=temp.node;
            int steps=temp.steps;
            if(curr==end) return steps;
            for(int i:arr){
                int val=(i*curr)%1000;
                if(!hs.contains(val)){
                    hs.add(val);
                    q.add(new Pair(val,steps+1));
                }
            }
        }
        return -1;
    }
}
class Pair{
    int node;
    int steps;
    Pair(int node,int steps){
        this.node=node;
        this.steps=steps;
    }
}