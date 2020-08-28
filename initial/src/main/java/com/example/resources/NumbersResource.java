package com.example.resources;

import com.example.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumbersResource {
    public static final String URL_PREFIX="/numbers";
    private final NumberService _numberService;

    @Autowired
    public NumbersResource(NumberService numberService) {
        _numberService = numberService;
    }

    @RequestMapping(URL_PREFIX + "/random")
    /**
     * @return a random int no larger than 10
     */
    public int getRandom() {
         return _numberService.getRand();
        }
    }
