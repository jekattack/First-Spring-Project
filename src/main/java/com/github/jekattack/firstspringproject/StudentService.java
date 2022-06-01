package com.github.jekattack.firstspringproject;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public Collection<Student> getStudents(){
        return studentRepo.getStudents();
    }

    public Student getStudent(String id){
        return studentRepo.getStudent(id);
    }

    public void addStudent(Student student){
        studentRepo.addStudent(student);
    }

}
