package com.study.mongo.controller;

import com.study.mongo.entity.Student;
import com.study.mongo.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public String createStudent(@RequestBody final Student student){
        return service.createStudent(student);
    }

    @GetMapping
    public Student findByEmail(@RequestParam final String email){
        return service.findByEmail(email);
    }
}
