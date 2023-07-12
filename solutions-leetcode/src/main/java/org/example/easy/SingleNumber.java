package org.example.easy;

import java.util.*;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        boolean finish = true;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for ( Map.Entry<Integer, Integer> num : map.entrySet() ) {
                if (num.getKey() == nums[i]) {
                    num.setValue(num.getValue() + 1);
                    finish = false;
                }
            }
            if (finish) map.put(nums[i], 1);
            else finish = true;
        }
        for ( Map.Entry<Integer, Integer> num : map.entrySet() ) {
            if (num.getValue() == 1) return num.getKey();
        }
        return 0;
    }
}
