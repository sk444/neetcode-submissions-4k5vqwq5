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
    int prev = Integer.MIN_VALUE;
    boolean isValid = true;
    public boolean isValidBST(TreeNode root)
    {
       validate(root);  
       return isValid;
    }

    private void validate(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        validate(node.left);

        if(prev >= node.val)
        {
            isValid = false;
        }
        prev = node.val;

        validate(node.right);
        
    }
}

