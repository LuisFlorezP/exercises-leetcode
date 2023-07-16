package org.example.easy;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String number = x + "";
        if (number.length() == 1) return true;
        for (int i = 0, j = number.length() - 1; i <= j; i++, j--) {
            if (number.charAt(i) != number.charAt(j)) return false;
        }
        return true;
    }
}
