/**
 * Staff.java
 * 2020.4.17
 */
package com.asiainfo.springbootdemo10.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 员工实体
 * @author yanggy
 */
@Setter
@Getter
public class Staff implements Serializable {

    private long id;

    private String name;

    private String pwd;

}
