package com.algorithm.tree.ntree;

import com.algorithm.tree.Node;

import java.util.ArrayList;
import java.util.List;

/**
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
}
