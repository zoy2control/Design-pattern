package com.zoy.design.pattern.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zoypong on 2019/5/3.
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("index")
    public String index() {
        return "hhhhhh";
    }
}
