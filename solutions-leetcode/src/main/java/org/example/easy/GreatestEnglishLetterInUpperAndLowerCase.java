package org.example.easy;

import java.util.*;

public class GreatestEnglishLetterInUpperAndLowerCase {

    public static String greatestLetter(String s) {
        TreeSet<Character> letterBig = new TreeSet<>(), letterSmall = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) + "").toLowerCase().equals(s.charAt(i) + "")) letterSmall.add(s.charAt(i));
            else letterBig.add(s.charAt(i));
        }
        List<Character> results = new ArrayList<>(letterBig);
        Collections.reverse(results);
        for ( Character result : results ) if (letterSmall.contains((result + "").toLowerCase().charAt(0))) return result + "";
        return "";
    }
}
