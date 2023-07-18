package org.example.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        Map<Integer, String> map = new TreeMap<>();
        Map<Character, String> finish = new TreeMap<>();
        String word = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') word += s.charAt(i);
            else {
                map.put(i, word);
                word = "";
            }
            if (i == s.length() - 1) map.put(i, word);
        }
        for ( Map.Entry<Integer, String> value : map.entrySet() ) {
            boolean change = true;
            index++;
            if (index - 1 == 0) finish.put(pattern.charAt(0), value.getValue());
            else {
                if (finish.containsKey(pattern.charAt(index - 1))) {
                    if (finish.get(pattern.charAt(index - 1)).equals(value.getValue())) continue;
                    else return false;
                }
                for ( Map.Entry<Character , String> result : finish.entrySet() ) {
                    if (result.getKey() == s.charAt(index - 1)) {
                        if (result.getValue().equals(value.getValue())) break;
                        change = false;
                        break;
                    }
                    if (result.getValue().equals(value.getValue())) return false;
                }
                if (change) finish.put(pattern.charAt(index - 1), value.getValue());
            }
        }
        return true;
    }
}
