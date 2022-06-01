package com.github.jekattack.firstspringproject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Student returnStudentById(@PathVariable String id){
        return service.getStudent(id);
    }

    @GetMapping
    public Collection<Student> returnStudents(){
        return service.getStudents();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

}
