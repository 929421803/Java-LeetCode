package com.wanghy.test.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ：WangHY
 * @date ：Created in 15:32 2019/5/7
 * @Description：
 */
public class GuPiao {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int money = 0;
        if(prices.length<=1) return 0;
        for (int i = 0 ;i < prices.length ; i++) {
            if(prices[i]<prices[i-1]){
                money += prices[i-1] - min;
                min = prices[--i];
            }else if(prices[i]<min){
                 min = prices[i];
             }else if(i == prices.length-1){
                money += prices[i] - min;
            }
        }
        return money;
    }
    public static void main(String[] args){
        int[] pri = {2,4,1};
        int max = maxProfit(pri);
        System.out.println(max);
    }

}
