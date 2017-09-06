package com.iwater.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangchuanhai on 2017/6/28.
 */
@Controller
public class DemoController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}
