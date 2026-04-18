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

class Solution 
{
    boolean flag = true;
    public boolean isBalanced(TreeNode root)
    {
        inorder(root);
        return flag;
        
    }

    private int inorder(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }

        int left =  inorder(node.left);

        int right = inorder(node.right);

        if(left > right && left-right > 1) 
        {
            flag = false;
        }
        else if(left < right && right - left > 1)
        {
             flag = false;
        }

        return 1 + Math.max(left, right);
    }
}
