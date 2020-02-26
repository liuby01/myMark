package com.liuby.mymark.controller;

import com.liuby.mymark.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/mark")
@RestController

public class MarkController {

    @Autowired
    MarkService markService;

    @RequestMapping("/")
    public List getMark() {
        return markService.getMark();
    }

}
