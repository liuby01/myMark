package com.liuby.mymark.service;

import com.liuby.mymark.repository.TeacherRepository;
import com.liuby.mymark.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;


}
