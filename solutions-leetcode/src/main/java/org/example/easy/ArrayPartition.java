package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class ArrayPartition {

    public static int arrayPairSum(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = nums[i], b = nums[j];
                if (a >= b) {
                    nums[j] = a;
                    nums[i] = b;
                }
            }
        }

        List<Integer> mins = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            mins.add(nums[i]);
        }

        int max = 0;
        for (Integer n : mins) {
            max += n;
        }
        return max;
    }
}
