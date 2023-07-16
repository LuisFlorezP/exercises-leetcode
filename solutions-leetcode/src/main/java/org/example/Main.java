package org.example;

import org.example.easy.*;
import org.example.easy.MergeTwoSortedLists.ListNode;
import org.example.easy.MergeTwoSortedLists.MergeTwoSortedLists;
import org.example.medium.SplitTwoStringstoMakePalindrome;
import org.example.medium.ZigzagConversion;

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

        // ZigzagConversion ---------->
        /*
            System.out.println("Resultado: " + ZigzagConversion.convert("AB", 1));
        */

        // ListNode ---------->
        /*
            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(4);
            node2.next = node3;
            node1.next = node2;
            ListNode node4 = new ListNode(1);
            ListNode node5 = new ListNode(3);
            ListNode node6 = new ListNode(5);
            node5.next = node6;
            node4.next = node5;
            ListNode node = MergeTwoSortedLists.mergeTwoLists(node1, node4);
            System.out.print("Resultado: ");
            while (true) {
                if (node.next == null) {
                    System.out.print(node.val);
                    break;
                }
                System.out.print(node.val + " - ");
                node = node.next;
            }
        */

        // BestTimetoBuyandSellStock ---------->
        /*
            int[] array = new int[5];
            array[0] = 7;
            array[1] = 6;
            array[2] = 4;
            array[3] = 3;
            array[4] = 1;
            System.out.println("Resultado: " + BestTimetoBuyandSellStock.maxProfit(array));
        */

        // SingleNumber ---------->
        /*
            System.out.println("Resultado: " + SingleNumber.singleNumber(new int[] {1}));
        */

        // ValidParentheses ---------->
        /*
            System.out.println("Resultado: " + ValidParentheses.isValid("[[[]"));
        */

        // HappyNumber ---------->
        /*
            System.out.println("Resultado: " + HappyNumber.isHappy(2));
        */

        // SplitTwoStringstoMakePalindrome ---------->
        /*
            System.out.println("Resultado: " + SplitTwoStringstoMakePalindrome.checkPalindromeFormation("ulacfd", "jizalu"));
        */

        // PalindromeNumber ---------->
        /*
            System.out.println("Resultado: " + PalindromeNumber.isPalindrome(101));
        */
    }
}