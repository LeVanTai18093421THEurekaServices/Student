package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    @Column(name="iddepartment")
    private long departmentId;

}
