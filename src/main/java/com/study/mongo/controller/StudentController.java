package com.study.mongo.controller;

import com.study.mongo.entity.Student;
import com.study.mongo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public String createStudent(@RequestBody final Student student){
        return service.createStudent(student);
    }
}
