package org.example.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for ( int value : arr ) {
            if (map.containsKey(value)) map.put(value, map.get(value) + 1);
            else map.put(value, 1);

        }
        for ( Map.Entry<Integer, Integer> value : map.entrySet() ) {
            if (list.contains(value.getValue())) return false;
            else list.add(value.getValue());
        }
        return true;
    }
}
