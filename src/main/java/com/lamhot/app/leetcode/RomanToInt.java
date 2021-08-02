package com.lamhot.app.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RomanToInt {


    public static void main(String ...args) {
        RomanToInt romanToInt = new RomanToInt();

        String input_1 = "III";
        String input_2 = "IV";
        String input_3 = "IX";
        String input_4 = "LVIII";
        String input_5 = "MCMXCIV";

        System.out.println("int of "+input_1+" is "+romanToInt.romanToInt(input_1));
        System.out.println("int of "+input_2+" is "+romanToInt.romanToInt(input_2));
        System.out.println("int of "+input_3+" is "+romanToInt.romanToInt(input_3));
        System.out.println("int of "+input_4+" is "+romanToInt.romanToInt(input_4));
        System.out.println("int of "+input_5+" is "+romanToInt.romanToInt(input_5));

    }


    public int romanToInt(String s) {
        Map<String, Integer> literalVsValueMap = new HashMap<>();
        literalVsValueMap.put("I", 1);
        literalVsValueMap.put("V", 5);
        literalVsValueMap.put("X", 10);
        literalVsValueMap.put("L", 50);
        literalVsValueMap.put("C", 100);
        literalVsValueMap.put("D", 500);
        literalVsValueMap.put("M", 1000);

        Map<String, String> literralVsBeforeAllowedLiteralMap = new HashMap<>();
        literralVsBeforeAllowedLiteralMap.put("V","I");
        literralVsBeforeAllowedLiteralMap.put("X","I");
        literralVsBeforeAllowedLiteralMap.put("L","X");
        literralVsBeforeAllowedLiteralMap.put("C","X");
        literralVsBeforeAllowedLiteralMap.put("D","C");
        literralVsBeforeAllowedLiteralMap.put("M","C");

        int value = 0;

        String prevLiteral = null;
        String currentLiteral = null;
        String prefixLiteral = null;

        for (int i = s.length() - 1; i >= 0; i--) {
            currentLiteral = s.substring(i,i+1);
            if(Objects.isNull(prevLiteral)) {
                value += literalVsValueMap.get(currentLiteral);
            } else {
                prefixLiteral = literralVsBeforeAllowedLiteralMap.get(prevLiteral);
                if(Objects.nonNull(prefixLiteral) && prefixLiteral.equals(currentLiteral)) {
                    value -= literalVsValueMap.get(currentLiteral);
                } else {
                    value += literalVsValueMap.get(currentLiteral);
                }
            }

            prevLiteral = currentLiteral;
        }

        return value;
    }
}