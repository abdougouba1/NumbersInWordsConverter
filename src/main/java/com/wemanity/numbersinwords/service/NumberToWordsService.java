package com.wemanity.numbersinwords.service;

import org.springframework.stereotype.Service;

@Service
public interface NumberToWordsService {


    /**
     * Converts a number to words.
     * @param number The number to convert.
     * @return The number in words.
     */
    String convertNumberToWords(int number);

    /**
     * Converts words to a number.
     * @param words The words to convert.
     * @return The converted number.
     */
    int convertWordsToNumber(String words);
}
