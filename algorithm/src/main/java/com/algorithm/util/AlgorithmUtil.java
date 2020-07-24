package com.algorithm.util;

import com.algorithm.define.ListNode;
import com.algorithm.define.Node;
import com.algorithm.define.TreeNode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AlgorithmUtil {
    public static final void println(String object){
        System.out.println(object);
    }

    public static final void println(Boolean object){
        System.out.println(object);
    }

    public static final void println(Integer object){
        System.out.println(object);
    }

    public static final void println(Long object){
        System.out.println(object);
    }

    public static final void println(Double object){
        System.out.println(object);
    }


    public static final void println(Float object){
        System.out.println(object);
    }

    public static final void println(List<List> object){
        for(List list : object){
            StringBuilder stringBuilder = new StringBuilder();
            for(Object integer : list){
                stringBuilder.append(integer).append(" ");
            }

            System.out.println(stringBuilder.toString());
        }
    }

//    public static final void println(List<String> result){
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for(String str : result) {
//            stringBuilder.append(str).append(" ");
//        }
//
//        System.out.println(stringBuilder.toString());
//    }

    public static final void println(int[] nums){
        StringBuilder stringBuilder = new StringBuilder();

        for(int num : nums){
            stringBuilder.append(num).append(" ");
        }

        System.out.println(stringBuilder.toString());
    }

    public static final void println(char[][] result){
        StringBuilder stringBuilder = new StringBuilder();

        for(char[] chars : result) {
            for (char theChar : chars) {
                stringBuilder.append(theChar).append(" ");
            }
        }

        System.out.println(stringBuilder.toString());
    }

    public static final void println(TreeNode root){
        if(root != null){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(root.val).append(" ").append("\n");
            System.out.println(stringBuilder.toString());

            println(root.left);
            println(root.right);
        }
    }

    public static final void println(Node root){
        if(root != null){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(root.val).append(" ").append("\n");
            System.out.println(stringBuilder.toString());

            if(root.children != null && root.children.size() > 0){
                for(Node node : root.children){
                    println(node);
                }
            }
        }
    }

    public static final void println(ListNode root){
        if(root != null){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(root.val).append(" ").append("\n");
            System.out.println(stringBuilder.toString());

            if(root.next != null){
                println(root.next);
            }
        }
    }


    public static int count(){
        int count = 0;
        File file = new File("F:\\leetcode\\algorithm010\\algorithm\\src\\main\\java\\com\\algorithm");
        if(file.isDirectory()){
            String[] fileList = file.list();
            for(String fileName : fileList){
                System.out.println(fileName);
            }
        }

        return count;
    }

    public static List<List<Integer>> asList(int[][] ints){
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < ints.length; i++) {
            List<Integer> integerList = new ArrayList<>();
            for (int j = 0; j < ints.length; j++) {
                integerList.add(ints[i][j]);
            }

            result.add(integerList);
        }

        return result;
    }




    public static void main(String[] args) {
        count();
    }
}
