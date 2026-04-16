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
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        inOrder(root, p, q);
        return ans;
        
    }

    private void inOrder(TreeNode node, TreeNode p, TreeNode q)
    { 
        if(node == null)
        {
            return;
        }
        if(p.val < node.val && q.val < node.val)
        {
            inOrder(node.left, p, q);
        }
        else if(p.val < node.val && q.val > node.val 
        || p.val > node.val && q.val < node.val )
        {
          ans = node;

          return;  
          
        }
        else if(p.val > node.val && q.val > node.val)
        {
          inOrder(node.right, p, q);
        }
        else if(p.val == node.val || q.val == node.val)
        {
            ans = node;
        }
        

    }
}
