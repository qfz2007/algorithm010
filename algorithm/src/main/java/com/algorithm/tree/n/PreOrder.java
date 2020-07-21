package com.algorithm.tree.n;

import com.algorithm.tree.Node;

import java.util.ArrayList;
import java.util.List;

/**
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

    public static void main(String[] args){

    }
}



