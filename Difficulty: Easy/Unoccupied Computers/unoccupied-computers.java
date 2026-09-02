class Solution {
    public int solve(int n, String s) {
        // code here
        int c=n,ans=0;//c-> number of computers available,ans->customers not assigned c;
        int arr[]=new int[26];
        ArrayList<Character> ar=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arr[ch-'A']==1){
                if(!ar.contains(ch)) if(c<n) c++;
                else ar.remove(ch);
                arr[ch-'A']--;
                // while(c>0&&ar.size()>0){
                //     c--;
                //     ar.remove(0);
                // }
            }
            else{
                arr[ch-'A']++;
                if(c==0){
                    ar.add(ch);
                    ans++;
                }
                else c--;
            }
        }
        return ans;
        
    }
}
