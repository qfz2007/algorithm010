package com.algorithm.tree.binary;

import com.algorithm.tree.TreeNode;


/**
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class BuildTree {
    /**
     * 解题思路，前序遍历的第一个节点一定是根节点，中序遍历的根节点的前面部分一定是左子树，后面部分一定是右子树，
     * 因此先根据前序遍历找出根节点，然后根据根节点找出中序遍历的根节点所在的位置进行遍历
     * @param preorder  前序遍历树
     * @param inorder   中序遍历树
     * @return
     */
    public  TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = null;
        if(preorder.length == 0 || inorder.length == 0){
            return root;
        }

        if(preorder.length != inorder.length){
            return root;
        }

        this.buildChildTree(root, preorder, inorder, 0, 0, 0, inorder.length);
        return root;
    }

    public void buildChildTree(TreeNode root, int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd){
        int value = root.val;

        /**在中序遍历树中指定范围内找出该节点作为根节点所在的位置*/
        for(int i = inStart ; i < inEnd; i++){
            if(preorder[i] == value){
                inEnd = i;
                break;
            }
        }

        /**左子树的第一个节点必然是根节点*/
        int leftNodeValue = preorder[preStart];

        root.left = new TreeNode(leftNodeValue);

        this.buildChildTree(root.left, preorder, inorder, preStart, preEnd, inStart, inEnd);
        this.buildChildTree(root.left, preorder, inorder, preStart, preEnd, inStart, inEnd);

    }

    public static void main(String[] args) {
        /**根左右*/
        int[] preorder = new int[]{3,9,20,15,7};
        /**左根右*/
        int[] inorder = new int[]{9,3,15,20,7};
        BuildTree buildTree = new BuildTree();
        TreeNode root = buildTree.buildTree(preorder, inorder);
    }
}

