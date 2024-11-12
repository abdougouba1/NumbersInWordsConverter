package com.wemanity.numbersinwords.util;


import java.util.HashMap;
import java.util.Map;

public class NumberToWordsUtil {

    private static final String[] UNITS = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static final String[] THOUSANDS = {
            "", "thousand", "million", "billion"
    };

    public static String convertLessThanThousand(int number) {
        String result = "";

        if (number % 100 < 20 && number % 100 > 0) {
            result = UNITS[number % 100];
            number /= 100;
        } else {
            if (number % 10 > 0) {
                result = UNITS[number % 10];
            }
            number /= 10;

            if (number % 10 > 0) {
                result = TENS[number % 10] + (result.isEmpty() ? "" : " " + result);
            }
            number /= 10;
        }

        if (number > 0) {
            result = UNITS[number] + " hundred" + (result.isEmpty() ? "" : " " + result);
        }

        return result.trim();
    }

    public static Map<String, Integer> buildWordToNumberMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < UNITS.length; i++) {
            map.put(UNITS[i], i);
        }
        for (int i = 2; i < TENS.length; i++) {
            map.put(TENS[i], i * 10);
        }
        map.put("hundred", 100);
        map.put("thousand", 1000);
        map.put("million", 1_000_000);
        map.put("billion", 1_000_000_000);
        return map;
    }
}
