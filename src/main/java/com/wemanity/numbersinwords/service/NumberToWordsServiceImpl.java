package com.wemanity.numbersinwords.service;

import com.wemanity.numbersinwords.util.NumberToWordsUtil;
import org.springframework.stereotype.Service;

@Service
public class NumberToWordsServiceImpl implements NumberToWordsService {

    @Override
    public String convertNumberToWords(int number) {
        if (number == 0) {
            return "zero dollars";
        }

        StringBuilder words = new StringBuilder();
        int index = 0;

        while (number > 0) {
            if (number % 1000 != 0) {
                words.insert(0, NumberToWordsUtil.convertLessThanThousand(number % 1000)
                        + " " + NumberToWordsUtil.THOUSANDS[index] + " ");
            }
            number /= 1000;
            index++;
        }

        return words.toString().trim() + " dollars";
    }

    @Override
    public int convertWordsToNumber(String words) {
        return 0;
    }
}
