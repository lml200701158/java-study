package com.mybatis.entity;

import lombok.Data;

/**
 * springtest数据库中user表的持久类
 */
@Data
public class MyUser {
    private Integer uid; // 主键
    private String uname;
    private String usex;
}
