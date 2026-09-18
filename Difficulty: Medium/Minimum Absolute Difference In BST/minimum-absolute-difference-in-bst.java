/* The Node structure is defined as
 class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int absDiff(Node root) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        inorder(root,ar);
        Collections.sort(ar);
        int df=1_000_001;
        for(int i=1;i<ar.size();i++){
            df=Math.min(df,ar.get(i)-ar.get(i-1));
        }
        return df;
    }
    void inorder(Node root,ArrayList<Integer>ar){
        if(root==null) return ;
        inorder(root.left,ar);
        ar.add(root.data);
        inorder(root.right,ar);
    }
}
