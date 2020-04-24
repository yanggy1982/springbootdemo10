/**
 * StaffMapper.java
 * 2020.4.17
 */
package com.asiainfo.springbootdemo10.dao;

import com.asiainfo.springbootdemo10.domain.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 员工实体Mapper
 * @author yanggy
 */
@Mapper
public interface StaffMapper {

    /**
     * 获取所有员工列表
     * @return
     */
    public List<Staff> getAll();

}
