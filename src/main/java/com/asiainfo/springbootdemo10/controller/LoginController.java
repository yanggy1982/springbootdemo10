/**
 * Copyright (C), 2015-2020, 亚信科技（中国）有限公司
 * Program     : springbootdemo10
 * FileName    : LoginController.java
 * Author      : yanggy
 * Date        : 2020-04-26 06:43
 * Description : 登陆控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.asiainfo.springbootdemo10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 登陆控制器
 *
 * @author Administrator
 * @since 1.0.0
 */
@Controller
public class LoginController {

    @GetMapping("login")
    public String login(){
        return "sys_loign";
    }

}
