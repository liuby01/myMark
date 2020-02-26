package com.liuby.mymark.controller;

import com.liuby.mymark.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/course")
@RestController

public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/")
    public List getCourse() {
        return courseService.getCourse();
    }

}
