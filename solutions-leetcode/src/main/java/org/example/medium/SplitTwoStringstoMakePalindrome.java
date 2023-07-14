package org.example.medium;

public class SplitTwoStringstoMakePalindrome {

    public static boolean checkPalindromeFormation(String a, String b) {
        for (int i = 0; i <= a.length(); i++) {
            if (valid(a.substring(0, i) + b.substring(i, b.length()))) return true;
            if (valid(b.substring(0, i) + a.substring(i, a.length()))) return true;
        }
        return false;
    }

    public static boolean valid(String newAB) {
        for (int j = 0, k = newAB.length() - 1; j < k; j++, k--) if (newAB.charAt(j) != newAB.charAt(k)) return false;
        return true;
    }
}
