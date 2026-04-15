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
    public int goodNodes(TreeNode root)
    {
       // path from root to x node, no value greater than x node.
       List<Integer> path = new ArrayList<>();
       List<Integer> goodNode = new ArrayList<>();
       dfs(root, path, goodNode);

       return goodNode.size();

    }

    private void dfs(TreeNode node, List<Integer> path, List<Integer> goodNode)
    {
        if(node == null) return;
        boolean good = true;
        for(Integer ii : path)
        {
            if(ii > node.val)
            {
                good = false;
                break;
            }
        }
        if(good)
        {
         goodNode.add(node.val);
        }
        path.add(node.val);

        dfs(node.left, path, goodNode);
        dfs(node.right, path, goodNode);

        path.remove(Integer.valueOf(node.val));
    }
}
