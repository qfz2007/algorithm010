package com.algorithm.tree.binary;

import com.algorithm.tree.TreeNode;

public class GenerateBinary {
    /**
     * 生成二叉树
     * 根节点索引为2^n-1
     * 左节点为2^n-1
     * 右节点为2^n
     * @return
     */
    public TreeNode generateBinary(int[] nums){
        TreeNode root = new TreeNode(nums[0]);
        return generate(nums, root, 1);
    }

    public TreeNode generate(int[] nums, TreeNode root, int level){
        root.left = new TreeNode(nums[2 * level - 1]);
        root.right = new TreeNode(nums[2 * level]);
        return null;
    }
}
