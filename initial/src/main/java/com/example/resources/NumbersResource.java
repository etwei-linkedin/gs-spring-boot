package com.example.resources;

import com.example.services.NumberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumbersResource {
    public static final String URL_PREFIX="/numbers";

    @RequestMapping(URL_PREFIX + "/random")
    public int getRandom() {
        NumberService ns = new NumberService();
         return ns.getRand();
        }
    }
