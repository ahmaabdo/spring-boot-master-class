package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ahmad on Fri - Jul 17, 2020
 */

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginMessage() {
        return "login";
    }
}
