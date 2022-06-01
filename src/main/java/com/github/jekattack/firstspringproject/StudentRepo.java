package com.github.jekattack.firstspringproject;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

@Repository
public class StudentRepo {

    private HashMap<String, Student> students = new HashMap<>();

    public Collection<Student> findAll(){
        return students.values();
    }

    public Optional<Student> findById(String id){
        return Optional.of(students.get(id));
    }

    public void save(Student student){
        students.put(student.getId(), student);
    }

}
