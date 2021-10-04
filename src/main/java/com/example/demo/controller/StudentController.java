package com.example.demo.controller;

import com.example.demo.configurationVO.Abstract;
import com.example.demo.repository.StudentReporitory;
import com.example.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/student/{id}")
    public Abstract getStudentAndDepartment(@PathVariable long id){
        return studentService.getStudentAndDepartment(id);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
