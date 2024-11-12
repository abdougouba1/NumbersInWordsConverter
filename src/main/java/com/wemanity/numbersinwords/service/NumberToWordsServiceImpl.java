package com.wemanity.numbersinwords.service;

import org.springframework.stereotype.Service;

@Service
public class NumberToWordsServiceImpl implements NumberToWordsService {

    private static final String[] UNITS = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] THOUSANDS = {
            "", "thousand", "million", "billion"
    };

    private String convertLessThanThousand(int number) {
        String result;

        if (number % 100 < 20) {
            result = UNITS[number % 100];
            number /= 100;
        } else {
            result = UNITS[number % 10];
            number /= 10;

            result = TENS[number % 10] + " " + result;
            number /= 10;
        }

        if (number == 0) {
            return result;
        }

        return UNITS[number] + " hundred" + " " + result;
    }

    @Override
    public String convertNumberToWords(int number) {
        return "";
    }

    @Override
    public int convertWordsToNumber(String words) {
        return 0;
    }
}
