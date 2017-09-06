package com.iwater.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangchuanhai on 2017/6/27.
 */
@Controller
public class BaseController {

    static final String ROOT_PATH = "/";

    /**
     * 默认跳转的页面
     * @return
     */
    @RequestMapping(ROOT_PATH)
    public String home() {
        return "welcome";
    }
}
