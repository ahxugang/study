package com.geoffrey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {

    @RequestMapping(value = "/")
    public String index() {
        //模版名称，实际的目录为：src/main/resources/templates/index.html
        return "index";
    }
}
