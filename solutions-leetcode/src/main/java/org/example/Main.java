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
            System.out.println("Resultado: " + ArrayPartition.arrayPairSum(new int[]{1,4,3,2}));
        */

        // TwoSum ---------->
        /*
            int[] result = TwoSum.twoSum(new int[]{2,7,11,15}, 9);
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
            System.out.println("Resultado: " + LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
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
            System.out.println("Resultado: " + BestTimetoBuyandSellStock.maxProfit(new int[]{7,6,4,3,1}));
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

        // RemoveDuplicatesFromSortedArray ---------->
        /*
            System.out.println("Resultado: " + RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        */

        // SqrtX ---------->
        /*
            System.out.println("Resultado: " + SqrtX.mySqrt(10));
        */

    }
}