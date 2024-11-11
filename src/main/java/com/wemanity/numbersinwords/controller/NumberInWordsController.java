package com.wemanity.numbersinwords.controller;

import com.wemanity.numbersinwords.service.NumberInWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/convert")
public class NumberInWordsController {

    @Autowired
    private NumberInWordsService numberInWordsService;

    @GetMapping("/number-to-words/{number}")
    public String convertNumberToWords(@PathVariable int number) {
        return numberInWordsService.convert(number);
    }

    @PostMapping("/words-to-number")
    public int convertWordsToNumber(@RequestBody String words) {
        return numberInWordsService.convert(words);
    }
}
