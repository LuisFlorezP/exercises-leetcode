package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    public static int calPoints(String[] operations) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            else if (operations[i].equals("C")) list.remove(list.size() - 1);
            else if (operations[i].equals("D")) list.add(list.get(list.size() - 1) * 2);
            else list.add(Integer.parseInt(operations[i]));
        }
        for ( Integer operation : list ) sum += operation;
        return sum;
    }
}
