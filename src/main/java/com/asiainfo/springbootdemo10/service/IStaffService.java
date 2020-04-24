/**
 * IStaffService.java
 * 2020.4.17
 */
package com.asiainfo.springbootdemo10.service;

import com.asiainfo.springbootdemo10.domain.Staff;

import java.util.List;

/**
 * 员工服务接口
 */
public interface IStaffService {

    /**
     * 获取所有员工列表
     * @return
     */
    public List<Staff> getAll();

}
