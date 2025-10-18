package com.vedprtpsingh.eexam.controller;

import org.hibernate.annotations.TimeZoneStorage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @GetMapping("/flana")
    public String hrm() {
        return "Home";
    }
}
