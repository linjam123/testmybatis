package com.how2j.testmybatis.entity;

import lombok.Data;

@Data
public class Customer {

    private Long id;
    private String customername;
    private String password;
    private String job;
}
