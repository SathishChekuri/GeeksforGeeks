class testClass implements in1 {
    public void display(int k) {
        // Add your code here.
        int cnt=0;
        for(int i=2;i<=k;i++){
            int c=0;
            for(int j=2;j<i/2+1;j++){
               if(i%j==0){
                c=1;
                break;
               }
            }
            if(c==0) cnt++;
        }
        System.out.println(cnt);
    }
}