/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
       // if(!isLeaf(root)) ans.add(root.val);
       if(!isLeaf(root)) ans.add(root.data);
        left(ans,root.left);
        leaf(ans,root);
        Stack<Integer> st=new Stack<>();
        right(st,root.right);
        while(!st.isEmpty()) ans.add(st.pop());
        return ans;
    }
    boolean isLeaf(Node root){
        return root==null||(root.left==null&&root.right==null);
    }
    void left(ArrayList<Integer> ans,Node root){
        if(isLeaf(root)) return;
         ans.add(root.data);
        if(root.left!=null){
            left(ans,root.left);
        }
        else if(root.right!=null){
             left(ans,root.right);
        }
    }
    void leaf(ArrayList<Integer> ans,Node root){
        if(root==null) return;
        leaf(ans,root.left);
        if(isLeaf(root)) ans.add(root.data);
        leaf(ans,root.right);
    }
    void right(Stack<Integer> st,Node root){
        if(isLeaf(root)) return;
         st.push(root.data);
        if(root.right!=null){
            right(st,root.right);
        }
        else if(root.left!=null){
              right(st,root.left);
        }
        
    }
}