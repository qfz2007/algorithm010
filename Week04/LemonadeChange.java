package com.algorithm.greedy;

/**
 * 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
 *
 * 顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
 *
 * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
 *
 * 注意，一开始你手头没有任何零钱。
 *
 * 如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
 *
 * 来源：力扣（LeetCode）
 * https://leetcode-cn.com/problems/lemonade-change/description/
 */
public class LemonadeChange {
    /**
     * 采用贪心算法实现的机制
     * 贪心算法就是每次寻找局部最优解
     * 贪心算法可以从头开始贪心也可以从尾巴开始贪心，或者中间开始贪心
     * @param bills
     * @return
     */
    public boolean lemonadeChange(int[] bills) {
        if(bills.length == 0){
            return false;
        }

        int five = 0;
        int ten = 0;
        for(int i = 0; i < bills.length; i++){
            switch (bills[i]){
                case 5:
                    five++;
                    break;
                case 10:
                    five--;
                    ten++;
                    break;
                case 20:
                    if(ten > 0){
                        ten--;
                        five--;
                    }else {
                        five -= 3;
                    }
                    break;
            }

            if(five < 0){
                break;
            }
        }

        boolean result = five >= 0;

        return result;
    }

    /**
     * 使用动态规划算法实现
     * @param bills
     * @return
     */
    public boolean lemonadeChangeOne(int[] bills) {
        return false;
    }

    public static void main(String[] args) {
        int[] bills = new int[]{5,5,5,10,20};
        bills = new int[]{5,5,10,10,20};
        //bills = new int[]{10,10};
        bills = new int[]{5,5,5,5,20,20,5,5,5,5};
        LemonadeChange lemonadeChange = new LemonadeChange();
        boolean result = lemonadeChange.lemonadeChange(bills);
        System.out.println("result="+result);
    }
}
