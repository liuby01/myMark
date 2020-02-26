package com.liuby.mymark.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Liuby
 * @date 2020-2-25 16:32
 */

@Data
@Entity
@Table(name = "teacher")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Teacher {

    @Id
    //教师号
    private Integer teaId;

    //姓名
    private String name;

    //密码
    private String pwd;


    //年龄
    private Integer age;


    //性别
    private Integer gender;

}

