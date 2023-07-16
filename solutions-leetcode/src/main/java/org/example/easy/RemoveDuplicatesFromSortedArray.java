package org.example.easy;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) numbers.add(nums[i]);
        int i = 0;
        for ( Integer number : numbers ) {
            nums[i] = number;
            i++;
        }
        return numbers.size();
    }
}
