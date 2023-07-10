package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> numbers = new ArrayList<>();
        boolean finish = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && finish && i != j) {
                    numbers.add(i);
                    numbers.add(j);
                    finish = false;
                }
            }
        }

        int[] results = new int[numbers.size()];
        int n = 0;
        for (Integer number : numbers) {
            results[n] = number;
            n++;
        }

        return results;
    }
}
