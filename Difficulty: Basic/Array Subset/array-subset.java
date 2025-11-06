
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
       for(int i=0;i<b.length;i++){
           int c=0;
           for(int j=0;j<a.length;j++){
               if(b[i]==a[j]){
                   c=1;
                   
                   b[i]=0;
                   a[j]=0;
                   break;
               }
           }
           if(c==0) return false;
       }
       return true;
    }
}
