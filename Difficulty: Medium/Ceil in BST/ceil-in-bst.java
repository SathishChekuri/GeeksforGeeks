/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        int ceil=-1;
        while(root!=null){
            if(root.data==x) return x;
            if(root.data>x){
                ceil=root.data;
                root=root.left;
            }
            else if(root.data<x) root=root.right;
        }
        return ceil;
    }
}