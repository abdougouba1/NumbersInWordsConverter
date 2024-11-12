package com.wemanity.numbersinwords.service;

import com.wemanity.numbersinwords.util.NumberToWordsUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

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
        if (words == null || words.isEmpty()) {
            return 0;
        }

        Map<String, Integer> wordToNumberMap = NumberToWordsUtil.buildWordToNumberMap();
        int result = 0;
        int current = 0;

        for (String word : words.toLowerCase().split(" ")) {
            if (wordToNumberMap.containsKey(word)) {
                int value = wordToNumberMap.get(word);
                if (value == 100) {
                    current *= value;
                } else if (value >= 1000) {
                    result += current * value;
                    current = 0;
                } else {
                    current += value;
                }
            }
        }
        return result + current;
    }
}
