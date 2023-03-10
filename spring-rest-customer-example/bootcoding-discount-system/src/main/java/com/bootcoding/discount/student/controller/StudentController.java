package com.bootcoding.discount.student.controller;

import com.bootcoding.discount.student.model.StudentData;
import com.bootcoding.discount.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/studentData")
    public List<StudentData> getAllStudentData(){

        return StudentService.getAllStudentData();
    }

}
