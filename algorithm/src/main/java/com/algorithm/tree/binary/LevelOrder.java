package com.algorithm.tree.binary;

import com.algorithm.define.TreeNode;
import com.algorithm.util.AlgorithmUtil;
import com.algorithm.util.TreeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * 层序遍历可以使用深度优先方式，和广度优先优先方式
 *  
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class LevelOrder {
    /**层序遍历节点列表*/
    List<List<Integer>> levelNodeList = new ArrayList<>();

    /**
     * 层序遍历可以使用深度优先方式和广度优先优先方式
     * @param root
     * @return
     */
    public List<List<Integer>> dfsLevelOrder(TreeNode root) {
        dfs(root, levelNodeList, 0);
        return levelNodeList;
    }

    /**
     * 深度优先检索
     * @return
     */
    public void dfs(TreeNode root, List<List<Integer>> levelNodeList, int level){
        if(root == null){
            return ;
        }

        if(levelNodeList.size() == level){
            levelNodeList.add(new ArrayList<>());
        }
        levelNodeList.get(level).add(root.val);

        this.dfs(root.left, levelNodeList, level + 1);
        this.dfs(root.right, levelNodeList, level + 1);
    }

    /**
     * 层序遍历可以使用深度优先方式，和广度优先优先方式
     * 该方法采用广度优先方式，
     * @param root
     * @return
     */
    public List<List<Integer>> bfsLevelOrder(TreeNode root) {
        this.bfs(root,levelNodeList, 0);
        return levelNodeList;
    }

    /**
     * 广度优先检索，广度优先,采用双端队列(Deque)存储遍历到的各个节点
     * @return
     */
    public void bfs(TreeNode root, List<List<Integer>> levelNodeList, int level){
        if(root == null){
            return ;
        }

        if(levelNodeList.size() == level){
            levelNodeList.add(new ArrayList<>());
        }
        levelNodeList.get(level).add(root.val);

        this.bfs(root.left, levelNodeList, level + 1);
        this.bfs(root.right, levelNodeList, level + 1);
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{
                3,9,20,null,null,15,7
        };
        TreeNode treeNode = TreeUtil.generateTreeNode(nums);
        LevelOrder levelOrder = new LevelOrder();
        List<List<Integer>> result = levelOrder.bfsLevelOrder(treeNode);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
