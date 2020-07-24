package com.algorithm.tree.binary;

import com.algorithm.define.TreeNode;
import com.algorithm.util.AlgorithmUtil;
import com.algorithm.util.TreeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 *  示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 *
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
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

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{
                1,null,2,3
        };
        TreeNode root = TreeUtil.generateTreeNode(nums);
        PreorderTraversal preorderTraversal = new PreorderTraversal();
        List<Integer> result = preorderTraversal.preorderTraversal(root);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
