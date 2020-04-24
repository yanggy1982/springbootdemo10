/**
 * StaffServiceImpl.java
 * 2020.4.17
 */
package com.asiainfo.springbootdemo10.service.impl;

import com.asiainfo.springbootdemo10.dao.StaffMapper;
import com.asiainfo.springbootdemo10.domain.Staff;
import com.asiainfo.springbootdemo10.service.IStaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工服务接口实现
 * @author yanggy
 */
@Service
public class StaffServiceImpl implements IStaffService {

    @Resource
    private StaffMapper staffMapper;

    /**
     * 获取所有员工列表
     * @return
     */
    public List<Staff> getAll(){
        return this.staffMapper.getAll();
    }

}
