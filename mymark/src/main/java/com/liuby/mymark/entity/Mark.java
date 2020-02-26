package com.liuby.mymark.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Liuby
 * @date 2020-2-25 16:45
 */

@Data
@Entity
@Table(name = "mark")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Mark {

    @Id
    //课程号
    private Integer couId;

    //学号
    private Integer stuId;

    //成绩
    private Integer score;

}

