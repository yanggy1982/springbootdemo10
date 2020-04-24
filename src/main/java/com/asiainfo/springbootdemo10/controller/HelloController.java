/**
 * HelloController.java
 * 2020.4.24
 */
package com.asiainfo.springbootdemo10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 * @author yanggy
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }

}
