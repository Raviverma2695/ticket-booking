package com.ravi.booking.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${spring.datasource.url}")
    String url;
    @GetMapping("/")
    @ResponseBody
    public String hone() {
        return "Hello World\n"+url;
    }
}
