package com.algorithm.tree.n;

import com.algorithm.define.Node;
import com.algorithm.util.AlgorithmUtil;
import com.algorithm.util.TreeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 *
 * 例如，给定一个 3叉树 :
 *
 *
 *
 *
 *
 * 返回其层序遍历:
 *
 * [
 *      [1],
 *      [3,2,4],
 *      [5,6]
 * ]
 *
 *
 *
 * 说明:
 *
 *     树的深度不会超过 1000。
 *     树的节点总数不会超过 5000。
 * N叉树的层序遍历,O(n)的时间复杂度
 * 可以使用递归遍历，或者使用广度优先搜索算法
 * https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
 */
public class LevelOrder {
    /**
     * 这里是使用dfs实现
     * */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levelList = new ArrayList<>();
        if(root == null) return levelList;
        this.getChildLevel(root, 0, levelList);
        return levelList;
    }

    private void getChildLevel(Node root, int level, List<List<Integer>> levelList){
        if(levelList.size() < level + 1){
            levelList.add(new ArrayList<>());
        }

        levelList.get(level).add(root.val);

        for(Node node : root.children){
            getChildLevel(node, level + 1, levelList);
        }
    }

    public void bfs(){

    }

    public void iteration(){

    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{
                1, 3,2,4, 5,6, null, null, null, null, null, null, null,
        };
        Node root = TreeUtil.generateNode(nums);
        LevelOrder levelOrder = new LevelOrder();
        List<List<Integer>> result = levelOrder.levelOrder(root);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
