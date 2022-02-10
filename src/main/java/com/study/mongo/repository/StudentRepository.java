package com.study.mongo.repository;

import com.study.mongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

interface StudentRepository extends MongoRepository<Student,String> {
}
