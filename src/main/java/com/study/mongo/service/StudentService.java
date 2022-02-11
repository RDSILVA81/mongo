package com.study.mongo.service;

import com.study.mongo.entity.Student;
import com.study.mongo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public String createStudent(Student student){
        var result = repository.save(student);
        return "Success";
    }
}
