package com.study.mongo.service;

import com.study.mongo.entity.Student;
import com.study.mongo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public String createStudent(Student student){
        var result = repository.save(student);
        return "Success";
    }

    public Student findByEmail(String email){
        return repository.findStudentByEmail(email).orElseThrow(()-> new IllegalStateException("Email not found!"));
    }
}
