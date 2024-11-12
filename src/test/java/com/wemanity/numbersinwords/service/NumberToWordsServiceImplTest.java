package com.wemanity.numbersinwords.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class NumberToWordsServiceImplTest {

    private final NumberToWordsServiceImpl numberToWordsService = new NumberToWordsServiceImpl();

    @Test
    public void testConvertNumberToWords_SingleDigit() {
        String result = numberToWordsService.convertNumberToWords(7);
        assertThat(result).isEqualTo("seven dollars");
    }

    @Test
    public void testConvertNumberToWords_TwoDigit() {
        String result = numberToWordsService.convertNumberToWords(45);
        assertThat(result).isEqualTo("forty five dollars");
    }

    @Test
    public void testConvertNumberToWords_ThreeDigit() {
        String result = numberToWordsService.convertNumberToWords(123);
        assertThat(result).isEqualTo("one hundred twenty three dollars");
    }

    @Test
    public void testConvertNumberToWords_Thousand() {
        String result = numberToWordsService.convertNumberToWords(1000);
        assertThat(result).isEqualTo("one thousand dollars");
    }

    @Test
    public void testConvertNumberToWords_LargeNumber() {
        String result = numberToWordsService.convertNumberToWords(1234567);
        assertThat(result).isEqualTo("one million two hundred thirty four thousand five hundred sixty seven dollars");
    }

    @Test
    public void testConvertWordsToNumber_SingleDigit() {
        int result = numberToWordsService.convertWordsToNumber("seven dollars");
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void testConvertWordsToNumber_TwoDigit() {
        int result = numberToWordsService.convertWordsToNumber("forty five dollars");
        assertThat(result).isEqualTo(45);
    }

    @Test
    public void testConvertWordsToNumber_ThreeDigit() {
        int result = numberToWordsService.convertWordsToNumber("one hundred twenty three dollars");
        assertThat(result).isEqualTo(123);
    }

    @Test
    public void testConvertWordsToNumber_Thousand() {
        int result = numberToWordsService.convertWordsToNumber("one thousand dollars");
        assertThat(result).isEqualTo(1000);
    }

    @Test
    public void testConvertWordsToNumber_LargeNumber() {
        int result = numberToWordsService.convertWordsToNumber("one million two hundred thirty four thousand five hundred sixty seven dollars");
        assertThat(result).isEqualTo(1234567);
    }

    @Test
    public void testConvertWordsToNumber_InvalidInput() {
        int result = numberToWordsService.convertWordsToNumber("");
        assertThat(result).isEqualTo(0);
    }

}
