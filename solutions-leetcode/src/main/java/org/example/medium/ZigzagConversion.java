package org.example.medium;

import java.util.Map;
import java.util.TreeMap;

public class ZigzagConversion {

    public static String convert(String s, int numRows) {
        int row = 1;
        boolean change = true;
        String work = "";
        Map<Integer, String[]> info = new TreeMap<>();

        if (numRows == 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            if (row > numRows) {
                change = false;
                row -= 2;
            }
            if (change) {
                String[] duo = new String[2];
                duo[0] = s.charAt(i) + "";
                duo[1] = row + "";
                info.put(i, duo);
                row++;
            } else {
                if (row != 0) {
                    String[] duo = new String[2];
                    duo[0] = s.charAt(i) + "";
                    duo[1] = row + "";
                    info.put(i, duo);
                    row--;
                } else {
                    change = true;
                    row += 2;
                    i--;
                }
            }
        }

        for (int i = 1; i <= numRows; i++) {
            for (Map.Entry<Integer, String []> value : info.entrySet()) {
                if (Integer.parseInt(value.getValue()[1]) == i) {
                    work += value.getValue()[0];
                }
            }
        }

        return work;
    }
}
