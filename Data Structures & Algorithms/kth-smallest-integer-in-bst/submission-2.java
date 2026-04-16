/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) 
    {
     List<Integer> list = new ArrayList<>();

     dfs(list, root); 

     return list.get(k-1);  
    }

    private void dfs(List<Integer> list, TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        dfs(list, node.left);
        list.add(node.val);
        dfs(list, node.right);
    }
}
