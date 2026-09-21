/* Structure of binary tree Node
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public boolean areAnagrams(Node root1, Node root2) {
        // code here
        Queue<ArrayList<String>> ans=new LinkedList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root1);
        while(!q.isEmpty()){
            int sz=q.size();
             ArrayList<String> t=new ArrayList<>();
            while(sz-->0){
                Node curr=q.poll();
                if(curr==null){
                    t.add("null");
                    continue;
                }
                t.add(curr.data+"");
                q.add(curr.left);
                q.add(curr.right);
            }
            ans.add(t);
        }
         q.add(root2);
         while(!q.isEmpty()){
            int sz=q.size();
            if(ans.isEmpty()) return false;
            ArrayList<String> t=ans.poll();
            while(sz-->0){
                Node curr=q.poll();
                if(curr==null){
                    if(!t.contains("null")) return false;
                    t.remove("null");
                    continue;
                }
                if(!t.contains(curr.data+"")) return false;
                t.remove(curr.data+"");
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;
    }
}
