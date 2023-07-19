package org.example.easy;

public class BestTimeToBuyandSellStock {

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;

        /*
        int min = prices[0], position = 0, max;
        List<Integer> list = new ArrayList<>();
        if (prices.length == 1) {
            return 0;
        }
        while (list.size() < prices.length) {
            for (int i = 0; i < prices.length; i++) {
                if (min == -1) {
                    min = prices[i];
                } else if (prices[i] == -1) {
                } else if (prices[i] <= min) {
                    min = prices[i];
                    position = i;
                }
            }
            if (position == prices.length - 1) {
                list.add(-1);
                prices[position] = -1;
                min = prices[0];
                continue;
            }
            max = prices[position + 1];
            for (int i = position + 1; i < prices.length; i++) {
                if (prices[i] >= max) {
                    max = prices[i];
                }
            }
            list.add(max - min);
            prices[position] = -1;
            min = prices[0];
        }
        Collections.sort(list);
        if (list.get(list.size() - 1) == -1) return 0;
        else return list.get(list.size() - 1);
        */

    }
}
