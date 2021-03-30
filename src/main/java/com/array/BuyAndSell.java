package com.array;

/**You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 */

public class BuyAndSell {
    public int calcProfit(int[] prices){
        int buy = 0;
        int sell = 0;
        boolean inTransaction = false;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= prices[i - 1] && !inTransaction) {
                buy = prices[i - 1];
                inTransaction = true;
            }
            if (prices[i] > sell && inTransaction) sell = prices[i];
            if (inTransaction && prices[i] < prices[i - 1]) {
                profit += sell - buy;
                inTransaction = false;
                buy = 0;
                sell = 0;
            }
        }
        if (inTransaction) profit += sell - buy;
        return profit;
    }
}
