package org.example.easy;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.charAt(0) == ']' || s.charAt(0) == ')' || s.charAt(0) == '}') return false;
        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) array[i] = s.charAt(i);
        for (int j = 0; j != s.length(); j += 2) {
            int position = 0;
            char letter = '.';
            for (int i = 0; i < array.length; i++, position++) {
                if (array[i] == ']') {
                    letter = '[';
                    break;
                }
                else if (array[i] == ')') {
                    letter = '(';
                    break;
                }
                else if (array[i] == '}') {
                    letter = '{';
                    break;
                }
            }
            if (letter == '.') return false;
            int newPosition = valid(letter, array, position - 1);
            if (newPosition == -1) return false;
            array[position] = '.';
            array[newPosition] = '.';
        }
        return true;

        /*
            for (int i = 1; i < s.length(); i += 2) {
                if (s.charAt(i) == ']') {
                    if (s.charAt(i - 1) != '[') {
                        return false;
                    }
                } else if (s.charAt(i) == ')') {
                    if (s.charAt(i - 1) != '(') {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (s.charAt(i - 1) != '{') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        */
    }

    public static int valid(char letter, char[] array, int position) {
        while (position != -1) {
            if (array[position] == letter) return position;
            else if (array[position] != '.') return -1;
            position--;
        }
        return -1;
    }


}
