package org.example.easy;

public class HappyNumber {

    public static boolean isHappy(int n) {
        String newN = n + "";
        int j = 0;
        while (true) {
            int newNumber = 0;
            for (int i = 0; i < newN.length(); i++) newNumber += Math.pow(Integer.parseInt(newN.charAt(i) + ""), 2);
            if (newNumber == 1) return true;
            else if (j == 100) return false;
            newN = newNumber + "";
            j++;
        }
    }
}
