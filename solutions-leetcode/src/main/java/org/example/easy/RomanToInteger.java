package org.example.easy;

public class RomanToInteger {

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result++;
            } else if (s.charAt(i) == 'V') {
                result += operationRoman(s, i, 'I', 3, 5);
            } else if (s.charAt(i) == 'X') {
                result += operationRoman(s, i, 'I', 8, 10);
            } else if (s.charAt(i) == 'L') {
                result += operationRoman(s, i, 'X', 30, 50);
            } else if (s.charAt(i) == 'C') {
                result += operationRoman(s, i, 'X', 80, 100);
            } else if (s.charAt(i) == 'D') {
                result += operationRoman(s, i, 'C', 300, 500);
            } else if (s.charAt(i) == 'M') {
                result += operationRoman(s, i, 'C', 800, 1000);
            }
        }

        return result;
    }

    private static int operationRoman(String s, int index, char letter, int numberOne, int numberTwo) {
        if (index - 1 >= 0) {
            if (s.charAt(index - 1) == letter) {
                return numberOne;
            } else return numberTwo;
        } else return numberTwo;
    }
}
