package com.liuby.mymark.controller;

import com.liuby.mymark.entity.Teacher;
import com.liuby.mymark.result.Result;
import com.liuby.mymark.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

//    @Autowired
//    TeacherService teacherService;
//
//    @PostMapping(value = "/login")
//    @ResponseBody
//    public Result login(@RequestBody Teacher requestTeacher) {
//        Integer teacherid = requestTeacher.getTeaId();
//        Teacher teacher = teacherService.get(teacherid, requestTeacher.getPwd());
//
//        if (null == teacher) {
//            return new Result(400);
//        } else {
//            return new Result(200);
//        }
//    }
}
