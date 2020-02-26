package com.liuby.mymark.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Liuby
 * @date 2020-2-25 16:47
 */

@Data
@Entity
@Table(name = "student")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Student {

    @Id
    //学号
    private Integer stuId;

    //姓名
    private String name;

    //密码
    private String pwd;

    //年龄
    private Integer age;

    //性别
    private Integer gender;

    //年级
    private Integer grade;

    //班级
    private String major;

}

