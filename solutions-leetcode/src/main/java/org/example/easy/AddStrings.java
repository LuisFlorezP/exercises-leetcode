package org.example.easy;

import java.math.BigInteger;

public class AddStrings {

    public static String addStrings(String num1, String num2) {
        return (new BigInteger(num1).add(new BigInteger(num2))).toString();
    }
}
