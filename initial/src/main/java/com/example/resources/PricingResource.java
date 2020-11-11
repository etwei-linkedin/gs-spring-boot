package com.example.resources;

import com.example.services.PricingService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PricingResource {

    public static final String URL_PREFIX = "/pricing";
    public final PricingService _pricingService;

    @Autowired
    public PricingResource(PricingService pricingService) {
        _pricingService = pricingService;
    }

    @RequestMapping(URL_PREFIX + "/{id}")
    public String getCourseData(@PathVariable("id") long id) throws JsonProcessingException, JSONException {
        return String.valueOf(_pricingService.getPricing(id));
    }
}
