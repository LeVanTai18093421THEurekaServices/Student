package com.example.demo.service;

import com.example.demo.configurationVO.Abstract;
import com.example.demo.configurationVO.Department;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentReporitory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class StudentServiceImp implements StudentService{


    @Autowired
    StudentReporitory studentReporitory;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Student getStudent(long id) {
        return studentReporitory.findById(id);
    }

    @Override
    public Abstract getStudentAndDepartment(long id) {
        //RestTemplate restTemplate = new RestTemplate();
        Abstract vo = new Abstract();
        Student student = getStudent(id);
        vo.setStudent(student);

        //
        Department department = restTemplate.getForObject("http://localhost:9001/department/"+
                student.getDepartmentId(), Department.class);

        vo.setDepartment(department);
        return vo;
    }

}
