package com.algorithm.tree.binary;

import com.algorithm.tree.TreeNode;

import java.util.*;

/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
class LowestCommonAncestor {
    /**
     * 1、实现思路是先递归出该节点的所有祖先节点，包括自己
     * 2、对比两个祖先节点列表长度，哪个更短，取其长度作为循环次数
     * 3、比较两个两个数组，获取最近的哪个相同的数组元素就是最近的共同祖先
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(q.val == p.val){
            return p;
        }

        /**递归p的最近公共祖先*/
        List<TreeNode> leftAncestorsNodeList = this.getAncestorsNode(root, p);

        /**递归p的最近公共祖先*/
        List<TreeNode> rightAncestorsNodeList = this.getAncestorsNode(root, q);

        int minLength = leftAncestorsNodeList.size() > rightAncestorsNodeList.size() ? rightAncestorsNodeList.size() : leftAncestorsNodeList.size();
        for(int i = minLength - 1; i >= 0; i--){
            if(leftAncestorsNodeList.get(i).val == rightAncestorsNodeList.get(i).val){
                return leftAncestorsNodeList.get(i);
            }
        }

        return null;
    }

    /**
     * 遍历出该节点的所有公共祖先节点，并按照从根节点顺序插入
     * @param root
     * @param p
     */
    public List<TreeNode> getAncestorsNode(TreeNode root, TreeNode p){
        List<TreeNode> ancestorsNodeList = new ArrayList<>();
        if(root == null){
            return ancestorsNodeList;
        }

        /**记录父节点*/
        ancestorsNodeList.add(root);

        if(root != null && root.val == p.val){
            return ancestorsNodeList;
        }

        if(root.val != p.val){
            List<TreeNode> leftAncestorsNodeList = getAncestorsNode(root.left, p);
            List<TreeNode> rightAncestorsNodeList = getAncestorsNode(root.right, p);

            if(leftAncestorsNodeList.size() > 0 && leftAncestorsNodeList.get(leftAncestorsNodeList.size() - 1).val == p.val){
                ancestorsNodeList.addAll(leftAncestorsNodeList);
            }

            if(rightAncestorsNodeList.size() > 0 && rightAncestorsNodeList.get(rightAncestorsNodeList.size() -1).val == p.val){
                ancestorsNodeList.addAll(rightAncestorsNodeList);
            }
        }

        return ancestorsNodeList;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(1);


        treeNode.left.left = new TreeNode(6);
        treeNode.left.left.left = null;
        treeNode.left.left.right = null;

        treeNode.right.left = new TreeNode(0);
        treeNode.right.right = new TreeNode(8);


        treeNode.left.right = new TreeNode(2);
        treeNode.left.right.left = new TreeNode(7);
        treeNode.left.right.right = new TreeNode(4);
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        TreeNode resultTreeNode = lowestCommonAncestor.lowestCommonAncestor(treeNode, new TreeNode(5), new TreeNode(4));
        System.out.println(resultTreeNode.val);
    }
}