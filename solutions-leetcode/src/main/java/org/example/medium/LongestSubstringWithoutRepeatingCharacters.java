package org.example.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        else if (s.length() == 1) return 1;
        String result = "";
        int size = 0, change = 0;
        boolean finish = false;
        List<String> longests = new ArrayList<>();
        Map<Character, Integer> secuence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (secuence.isEmpty()) {
                secuence.put(s.charAt(0), 0);
                continue;
            }
            if (secuence.containsKey(s.charAt(i))) {
                finish = true;
                change = secuence.get(s.charAt(i)) + 1;
            }
            if (finish) {
                for (Map.Entry<Character, Integer> letter : secuence.entrySet()) result += letter.getKey();
                longests.add(result);
                result = "";
                secuence.clear();
                finish = false;
                i = change;
                secuence.put(s.charAt(i), i);
            } else secuence.put(s.charAt(i), i);
            if (i == s.length() - 1) {
                for (Map.Entry<Character, Integer> letter : secuence.entrySet()) result += letter.getKey();
                longests.add(result);
            }
        }
        for (String longest : longests) {
            if (size == 0) size = longest.length();
            if (longest.length() >= size) size = longest.length();
        }
        return size;
    }
}
