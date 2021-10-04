package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public interface StudentReporitory extends CrudRepository<Student,Long> {
    public Student findById(long id);

}

