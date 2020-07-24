package com.algorithm.tree.n;

import com.algorithm.define.Node;
import com.algorithm.util.AlgorithmUtil;
import com.algorithm.util.TreeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 *
 *
 *
 *
 * 返回其后序遍历: [5,6,3,2,4,1].
 *
 *
 *
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 * https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 */
public class Postorder {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        return result;
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{
                1, 3,2,4, 5,6, null, null, null, null, null, null, null,
        };
        Node root = TreeUtil.generateNode(nums);
        Postorder postorder = new Postorder();
        List<Integer> result = postorder.postorder(root);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
