package com.liuby.mymark.service;

import com.liuby.mymark.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List getCourse() {
        return courseRepository.getAll();
    }

}
