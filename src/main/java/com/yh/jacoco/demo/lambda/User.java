package com.yh.jacoco.demo.lambda;

import lombok.Data;

/**
 * @version User.java, v 0.1 2019-08-22 17:20
 */
@Data
public class User {

    /**
     * 用户编号
     */
    private String id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 构造器
     * @param id
     * @param name
     */
    public User(String id, String name){
        this.id = id;
        this.name = name;
    }

}
