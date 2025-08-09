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
 import java.util.*;
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
     if(root == null ) return -1;

     List<Long> levelsums = new ArrayList< >();
     Queue<TreeNode> queue = new LinkedList<>();
     queue.offer(root);

     while(!queue.isEmpty()){
        int size = queue.size();
        long sum = 0;
        for(int i = 0 ;i<size;i++){
            TreeNode node = queue.poll();
            sum += node.val;
            if(node.left!=null) queue.offer(node.left);
            if(node.right!= null) queue.offer(node.right);
        }
        levelsums.add(sum);
     }   
     if(levelsums.size()<k) return -1;
     levelsums.sort(Collections.reverseOrder());
     return levelsums.get(k-1);
    }
}