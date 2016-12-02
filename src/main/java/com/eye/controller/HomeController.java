package com.eye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by holdlg on 2016/12/2.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }
}
