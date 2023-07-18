package org.example.easy;

public class MinimumBitFlipsToConvertNumber {

    public static int minBitFlips(int start, int goal) {
        int count = 0;
        String max = Integer.toBinaryString(Math.max(start, goal)), min = "", aux = Integer.toBinaryString(Math.min(start, goal));
        for (int i = aux.length(); i < max.length(); i++) min += 0;
        min += aux;
        for (int i = 0; i < max.length(); i++) if (max.charAt(i) != min.charAt(i)) count++;
        return count;
    }
}
