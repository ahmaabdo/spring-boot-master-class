package com.in28minutes.springboot.web.springbootfirstwebapplication.service;

import org.springframework.stereotype.Component;

/**
 * Created by ahmad on Fri - Jul 17, 2020
 */

@Component
public class LoginService {

    public boolean validateUser(String userId,String password){

        return userId.equalsIgnoreCase("aa")
                && password.equalsIgnoreCase("aa");
    }

}
