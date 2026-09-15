/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public int getCount(Node root, int k) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        findLeaf(root,k,ar,1);
        Collections.sort(ar);
        int sum=0,c=0;
        for(int i:ar){
            sum+=i;
            if(sum<=k) c++;
            else break;
        }
        return c;
    }
    void findLeaf(Node root,int k,ArrayList<Integer> ar,int ch){
        if(root==null) return;
        if(root.right==null&&root.left==null){
            ar.add(ch);
            return;
        }
        findLeaf(root.left,k,ar,ch+1);
        findLeaf(root.right,k,ar,ch+1);
    }
}