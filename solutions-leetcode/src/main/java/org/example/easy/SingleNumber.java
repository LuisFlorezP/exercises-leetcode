package org.example.easy;

import java.util.*;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        boolean finish = true;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                finish = false;
            }
            if (finish) map.put(nums[i], 1);
            else finish = true;
        }
        for ( Map.Entry<Integer, Integer> num : map.entrySet() ) if (num.getValue() == 1) return num.getKey();
        return 0;
    }
}
