package org.example;

import org.example.easy.UniqueNumberOfOccurrences;

public class Main {

    public static void main(String[] args) {


        // <-----------------------------------------> EASY <----------------------------------------->


        // MergeTwoSortedLists ---------->
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

        // AddStrings ---------->
        /*
            System.out.println("Resultado: " + AddStrings.addStrings("11", "123"));
        */

        // ArrayPartition ---------->
        /*
            System.out.println("Resultado: " + ArrayPartition.arrayPairSum(new int[]{1,4,3,2}));
        */

        // BaseballGame ---------->
        /*
            System.out.println("Resultado: " + BaseballGame.calPoints(new String[]{}));
        */

        // BestTimeToBuyandSellStock ---------->
        /*
            System.out.println("Resultado: " + BestTimeToBuyandSellStock.maxProfit(new int[]{7,6,4,3,1}));
        */

        // CountNegativeNumbersInASortedMatrix ---------->
        /*
            System.out.println("Resultado: " + CountNegativeNumbersInASortedMatrix.countNegatives(new int[][]{{5,1,0},{-5,-5,-5}}));
        */

        // GreatestEnglishLetterInUpperAndLowerCase ---------->
        /*
            System.out.println("Resultado: " + GreatestEnglishLetterInUpperAndLowerCase.greatestLetter("lEeTcOdE"));
        */

        // HappyNumber ---------->
        /*
            System.out.println("Resultado: " + HappyNumber.isHappy(2));
        */

        // LongestCommonPrefix ---------->
        /*
            System.out.println("Resultado: " + LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        */

        // MinimumBitFlipsToConvertNumber ---------->
        /*
            System.out.println("Resultado: " + MinimumBitFlipsToConvertNumber.minBitFlips(58, 69));
        */

        // PalindromeNumber ---------->
        /*
            System.out.println("Resultado: " + PalindromeNumber.isPalindrome(101));
        */

        // RemoveDuplicatesFromSortedArray ---------->
        /*
            System.out.println("Resultado: " + RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        */

        // RomanToInteger ---------->
        /*
            System.out.println("Resultado: " + RomanToInteger.romanToInt("IV"));
        */

        // SingleNumber ---------->
        /*
            System.out.println("Resultado: " + SingleNumber.singleNumber(new int[] {1}));
        */

        // SqrtX ---------->
        /*
            System.out.println("Resultado: " + SqrtX.mySqrt(10));
        */

        // TwoSum ---------->
        /*
            int[] result = TwoSum.twoSum(new int[]{2,7,11,15}, 9);
            System.out.print("Resultado: " + ("[" + result[0] + ", " + result[1] + "]"));
        */

        // UniqueNumberOfOccurrences ---------->

            System.out.println("Resultado: " + UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1,2,2,1,1,3}));


        // ValidParentheses ---------->
        /*
            System.out.println("Resultado: " + ValidParentheses.isValid("[[[]"));
        */

        // Word Pattern ---------->
        /*
            System.out.println("Resultado: " + WordPattern.wordPattern("abba", "dog cat cat fish"));
        */


        // <-----------------------------------------> MEDIUM <----------------------------------------->


        // LongestSubstringWithoutRepeatingCharacters ---------->
        /*
            System.out.println("Resultado: " + LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcb"));
        */

        // RepeatedDNASequences ---------->
        /*
            RepeatedDNASequences.findRepeatedDnaSequences("CCGGCCGGCCGGCC").forEach(value -> {
                System.out.println("Resultado: " + value);
            });
        */

        // SplitTwoStringsToMakePalindrome ---------->
        /*
            System.out.println("Resultado: " + SplitTwoStringsToMakePalindrome.checkPalindromeFormation("ulacfd", "jizalu"));
        */

        // ZigzagConversion ---------->
        /*
            System.out.println("Resultado: " + ZigzagConversion.convert("AB", 1));
        */


        // <-----------------------------------------> HARD <----------------------------------------->


    }
}