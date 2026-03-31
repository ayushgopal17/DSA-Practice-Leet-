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
    List<Integer> l1= new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if( root ==null) return true;
        
       isValidBST(root.left);
       l1.add(root.val);
       isValidBST(root.right);

       for(int i=1;i<l1.size();i++){
        if(l1.get(i) <= l1.get(i-1)){
            return false;
        }
       }

        return true;
    }
}