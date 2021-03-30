package com.array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuyAndSellTest {
    BuyAndSell buyAndSell = new BuyAndSell();

    @Test
    public void test1() {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = 7;
        Assertions.assertEquals(buyAndSell.calcProfit(prices), maxProfit);
    }

    @Test
    public void test2() {
        int[] prices = {1,2,3,4,5};
        int maxProfit = 4;
        Assertions.assertEquals(buyAndSell.calcProfit(prices), maxProfit);
    }

    @Test
    public void test3() {
        int[] prices = {7,6,4,3,1};
        int maxProfit = 0;
        Assertions.assertEquals(buyAndSell.calcProfit(prices), maxProfit);
    }
}
