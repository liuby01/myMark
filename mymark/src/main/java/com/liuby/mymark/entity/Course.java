package com.liuby.mymark.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Liuby
 * @date 2020-2-25 16:44
 */

@Data
@Entity
@Table(name = "course")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Course {

    @Id
    //课程号
    private Integer couId;

    //课程名称
    private String name;

   //教师号
    private Integer teaId;

}

