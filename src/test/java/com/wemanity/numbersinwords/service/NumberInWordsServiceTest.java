package com.wemanity.numbersinwords.service;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class NumberInWordsServiceTest {

    private final NumberInWordsService numberToWordsService = new NumberInWordsService();

    @Test
    public void testConvertNumberToWords() {
        assertEquals("seven hundred and forty-five dollars", numberToWordsService.convert(745));
        assertEquals("one thousand dollars", numberToWordsService.convert(1000));
        assertEquals("zero dollars", numberToWordsService.convert(0));
    }

    @Test
    public void testConvertWordsToNumber() {
        assertEquals(745, numberToWordsService.convert("seven hundred and forty-five dollars"));
        assertEquals(1000, numberToWordsService.convert("one thousand dollars"));
        assertEquals(0, numberToWordsService.convert("zero dollars"));
    }
}
