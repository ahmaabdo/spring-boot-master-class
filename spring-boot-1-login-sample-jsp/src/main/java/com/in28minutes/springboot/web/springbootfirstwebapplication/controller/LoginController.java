package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import com.in28minutes.springboot.web.springbootfirstwebapplication.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ahmad on Fri - Jul 17, 2020
 */

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        //JSP PAGE NAME
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
        if (!loginService.validateUser(name, password)){
            model.put("error", "Invalid username or password");
            return "login";
        }

        model.put("password", password);
        model.put("name", name);

//      http://localhost:8091/login?name=ahmad
        System.out.println("name is " + name);

        //JSP PAGE NAME
        return "welcome";
    }
}
