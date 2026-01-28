class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:arr){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        for(int i:hs.keySet()){
            if((hs.get(i))>1) ar.add(i);
        }
        return ar;
    }
}