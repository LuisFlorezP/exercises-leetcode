package org.example.easy;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String work = "";
        int longitud = strs[0].length(), position = 0;
        boolean finish = true, agree = true;
        char letter;

        for (int i = 1; i < strs.length; i++)
            if (strs[i].length() <= longitud) {
                longitud = strs[i].length();
                position = i;
            }

        while (true) {
            for (int i = 0; i < longitud; i++) {
                letter = strs[position].charAt(i);
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].charAt(i) != letter) {
                        agree = false;
                        break;
                    }
                }
                if (i == longitud - 1 ) {
                    if (agree)
                        work += letter;
                    finish = true;
                } else {
                    if (agree) {
                        work += letter;
                        finish = false;
                    } else finish = true;
                }
            }
            if (finish) break;
        }

        return work;
    }
}
