package 栈_队列;

import common.TreeNode;

/**
 * @author wei junbin
 * @create 2021-10-10 17:25
 */
public class _654_最大二叉树 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums==null) return null;
        return findMax(nums, 0, nums.length);
    }
    private TreeNode findMax(int[] nums, int l, int r) {
        if (l==r) return null;
        int max = l;
        for (int i = l + 1; i < r; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        TreeNode root = new TreeNode(nums[max]);
        root.left=findMax(nums,l,max);
        root.right=findMax(nums,max+1,r);
        return root;
    }
}
