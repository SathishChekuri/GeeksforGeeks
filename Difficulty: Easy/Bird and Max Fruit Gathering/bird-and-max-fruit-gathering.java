class Solution {
    public int maxFruits(ArrayList<Integer> arr, int m) {
        // code here
        int i=0,j=0;
        int mx=0,sum=0;
        for(j=0;j<m;j++){
            sum+=arr.get(j);
        }
        mx=sum;
        if(j==arr.size()) return mx;
        while(true){
            sum+=arr.get(j)-arr.get(i);
            mx=Math.max(sum,mx);
            if(i==arr.size()-1) break;
            i=(i+1)%arr.size();
            j=(j+1)%arr.size();
        }
        return mx;
    }
}