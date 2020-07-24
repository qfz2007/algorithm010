package com.algorithm.tree.n;

import com.algorithm.define.Node;
import com.algorithm.util.AlgorithmUtil;
import com.algorithm.util.TreeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 *
 *
 *
 *
 * 返回其前序遍历: [1,3,5,6,2,4]。
 *
 *
 *
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 *
 *  N 叉树的前序遍历（亚马逊在半年内面试中考过）
 *  https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/
 */
public class PreOrder {
    /**
     * N叉树的前序遍历，
     * 树的遍历基本上都是使用递归实现的,下面采用递归实现
     * @param root 节点
     * @return
     */
    public List<Integer> preorder(Node root) {
        List<Integer> nodeValue = new ArrayList<>();
        if(root == null){
            return nodeValue;
        }

        nodeValue.add(root.val);
        if(root.children.size() > 0){
            for(Node node : root.children){
                List<Integer> childNodeValue = this.preorder(node);
                nodeValue.addAll(childNodeValue);
            }
        }

        return nodeValue;
    }

    /**使用迭代方式实现N叉树的前序遍历*/
    public List<Integer> iteroter(Node root) {
        List<Integer> nodeValue = new ArrayList<>();
        return nodeValue;
    }

    public static void main(String[] args){
        Integer[] nums = new Integer[]{
            1, 3,2,4, 5,6, null, null, null, null, null, null, null,
        };
        Node root = TreeUtil.generateNode(nums);
        PreOrder preOrder = new PreOrder();
        List<Integer> result = preOrder.preorder(root);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}



