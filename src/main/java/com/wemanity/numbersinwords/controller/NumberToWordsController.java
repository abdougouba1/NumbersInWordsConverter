package com.wemanity.numbersinwords.controller;
import com.wemanity.numbersinwords.service.NumberToWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/numbers")
public class NumberToWordsController {

    private final NumberToWordsService numberToWordsService;

    @Autowired
    public NumberToWordsController(NumberToWordsService numberToWordsService) {
        this.numberToWordsService = numberToWordsService;
    }

    @GetMapping("/to-words/{number}")
    public String convertNumberToWords(@PathVariable int number) {
        return numberToWordsService.convertNumberToWords(number);
    }

    @GetMapping("/to-number")
    public int convertWordsToNumber(@RequestParam String words) {
        return numberToWordsService.convertWordsToNumber(words);
    }

}
