/* Structure of Binary Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {

     int numberOfTurns(Node root, int p, int q) {

         StringBuilder pathP=new StringBuilder();
         StringBuilder pathQ=new StringBuilder();

         if(!findPath(root,p,pathP) || !findPath(root,q,pathQ))
             return -1;

         int i=0;

         // Find common path
         while(i<pathP.length() &&
               i<pathQ.length() &&
               pathP.charAt(i)==pathQ.charAt(i)) {
             i++;
         }

         // Directions from LCA to p
         String pPart=pathP.substring(i);

         // Directions from LCA to q
         String qPart=pathQ.substring(i);

         // Path p -> LCA is reverse of pPart.
         // Then LCA -> q is qPart.
         String path=reverse(pPart)+qPart;

         if(path.length()<=1)
             return -1;

         int turns=0;

         for(int j=1;j<path.length();j++){
             if(path.charAt(j)!=path.charAt(j-1))
                 turns++;
         }

         return turns==0 ? -1 : turns;
     }

     boolean findPath(Node root,int target,StringBuilder path) {

         if(root==null)
             return false;

         if(root.data==target)
             return true;

         path.append('L');

         if(findPath(root.left,target,path))
             return true;

         path.deleteCharAt(path.length()-1);

         path.append('R');

         if(findPath(root.right,target,path))
             return true;

         path.deleteCharAt(path.length()-1);

         return false;
     }

     String reverse(String s) {
         return new StringBuilder(s).reverse().toString();
     }
 }