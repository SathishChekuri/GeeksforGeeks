/* Structure of binary tree node
class Node
{
	int data;
	Node left, right;
	
	Node(int item)
	{
		data = item;
		left = right = null;
	}
}
*/

class Solution {
	int ans = Integer.MIN_VALUE;
	
	int maxDiff(Node root) {
		ans = Integer.MIN_VALUE;
		dfs(root, root.data);
		return ans;
	}
	
	void dfs(Node root, int maxAncs) {
		if (root == null)
			return;
		
		if (root.left != null) {
			ans = Math.max(ans, maxAncs - root.left.data);
			dfs(root.left, Math.max(maxAncs, root.left.data));
		}
		
		if (root.right != null) {
			ans = Math.max(ans, maxAncs - root.right.data);
			dfs(root.right, Math.max(maxAncs, root.right.data));
		}
	}
}
