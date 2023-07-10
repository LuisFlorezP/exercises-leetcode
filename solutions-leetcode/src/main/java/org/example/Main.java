package org.example;

import org.example.easy.ArrayPartition;
import org.example.easy.LongestCommonPrefix;
import org.example.easy.RomanToInteger;
import org.example.easy.TwoSum;

public class Main {

    public static void main(String[] args) {

        // ArrayPartition ---------->
        /*
            int[] array = new int[4];
            array[0] = 1;
            array[1] = 4;
            array[2] = 3;
            array[3] = 2;
            System.out.println("Resultado: " + ArrayPartition.arrayPairSum(array));
        */

        // TwoSum ---------->
        /*
            int[] array = new int[4];
            array[0] = 2;
            array[1] = 7;
            array[2] = 11;
            array[3] = 15;
            int[] result = TwoSum.twoSum(array, 9);
            System.out.print("Resultado: " + ("[" + result[0] + ", " + result[1] + "]"));
        */

        // LongestSubstringWithoutRepeatingCharacters ---------->
        /*
            System.out.println("Resultado: " + LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcb"));
        */

        // RomanToInteger ---------->
        /*
            System.out.println("Resultado: " + RomanToInteger.romanToInt("IV"));
        */

        // LongestCommonPrefix ---------->
        /*
            String[] array = new String[3];
            array[0] = "flower";
            array[1] = "flow";
            array[2] = "flight";
            System.out.println("Resultado: " + LongestCommonPrefix.longestCommonPrefix(array));
        */

    }
}