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

    @Override
    public String convertNumberToWords(int number) {
        return "";
    }

    @Override
    public int convertWordsToNumber(String words) {
        return 0;
    }
}
