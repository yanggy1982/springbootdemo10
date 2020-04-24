/**
 * StaffController.java
 * 2020.4.17
 */
package com.asiainfo.springbootdemo10.controller;

import com.asiainfo.springbootdemo10.domain.Staff;
import com.asiainfo.springbootdemo10.service.IStaffService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 员工操作控制器
 */
@Controller
@Slf4j
public class StaffController {

    @Autowired
    private IStaffService staffService;

    /**
     * 返回所有员工信息
     * @return
     */
    @RequestMapping("/getStaffList")
    @ResponseBody
    public List<Staff> getStaffList() {
        log.info("getStaffList");
        return this.staffService.getAll();
    }

}
