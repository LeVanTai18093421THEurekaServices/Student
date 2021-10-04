package com.example.demo.service;

import com.example.demo.configurationVO.Abstract;
import com.example.demo.entity.Student;

public interface StudentService {
    public Student getStudent(long id);
    public Abstract getStudentAndDepartment(long id);
}
