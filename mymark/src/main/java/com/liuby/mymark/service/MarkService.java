package com.liuby.mymark.service;

import com.liuby.mymark.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MarkService {

    @Autowired
    MarkRepository markRepository;

    public List getMark(){
        return markRepository.getAll();
    }
}
