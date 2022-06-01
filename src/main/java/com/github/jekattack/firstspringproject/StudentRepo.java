package com.github.jekattack.firstspringproject;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class StudentRepo {

    private HashMap<String, Student> students = new HashMap<>();

    public Collection<Student> getStudents(){
        return students.values();
    }

    public Student getStudent(String id){
        return students.get(id);
    }

    public void addStudent(Student student){
        students.put(student.getId(), student);
    }

}
