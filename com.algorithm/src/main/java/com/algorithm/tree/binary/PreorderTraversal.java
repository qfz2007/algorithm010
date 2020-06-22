package com.algorithm.tree.binary;

import com.algorithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class PreorderTraversal {
    /**
     * 前序遍历，根左右
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){return result;}

        /**记录根节点*/
        result.add(root.val);

        /**左节点*/
        List<Integer> left  = this.preorderTraversal(root.left);
        /**右节点*/
        List<Integer> right = this.preorderTraversal(root.right);

        /**记录左节点*/
        result.addAll(left);

        /**记录右节点*/
        result.addAll(right);
        return result;
    }
}
