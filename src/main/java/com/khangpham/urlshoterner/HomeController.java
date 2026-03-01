package com.khangpham.urlshoterner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String sayHello() {
        System.out.println("appName: " + appName);
        return "index.html";
    }

}
