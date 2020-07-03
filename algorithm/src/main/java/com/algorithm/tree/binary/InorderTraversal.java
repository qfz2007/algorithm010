package com.algorithm.tree.binary;

import com.algorithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 * 1. 使用递归算法实现,中序遍历是左根右
 * 2. 使用迭代算法实现
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        List<Integer> left = this.inorderTraversal(root.left);
        List<Integer> right = this.inorderTraversal(root.right);

        /**记录左节点*/
        result.addAll(left);
        /**记录跟节点*/
        result.add(root.val);
        /**记录右节点*/
        result.addAll(right);
        return result;
    }
}


