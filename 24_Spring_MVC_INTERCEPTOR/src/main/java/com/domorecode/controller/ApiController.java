package com.domorecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ApiController {

    @GetMapping("/data")
    public String getData() {
        return "Here is some secure data!";
    }
}
