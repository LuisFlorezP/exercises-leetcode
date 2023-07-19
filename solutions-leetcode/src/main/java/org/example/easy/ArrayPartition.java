package org.example.easy;

import java.util.*;

public class ArrayPartition {

    public static int arrayPairSum(int[] nums) {
        List<Integer> mins = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) mins.add(nums[i]);
        Collections.sort(mins);
        int max = 0;
        for (int i = 0; i < mins.size(); i += 2) max += mins.get(i);
        return max;
    }
}
