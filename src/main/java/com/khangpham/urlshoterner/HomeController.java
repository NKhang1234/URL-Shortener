package com.khangpham.urlshoterner;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String sayHello() {
        return "index.html";
    }
}
