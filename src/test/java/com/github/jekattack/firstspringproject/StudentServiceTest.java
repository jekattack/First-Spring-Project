package com.github.jekattack.firstspringproject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void shouldReturnStudent(){
        //Given
        StudentRepo studentRepo = Mockito.mock(StudentRepo.class);
        StudentService studentService = new StudentService(studentRepo);
        Student student = new Student("Sigmund");
        Mockito.when(studentRepo.findById("123")).thenReturn(Optional.of(student));
        //When
        Student actual = studentService.getStudent("123");
        //Then
        Assertions.assertThat(actual).isEqualTo(student);
    }

    @Test
    void shouldReturnAllStudents(){
        //Given
        StudentRepo studentRepo = Mockito.mock(StudentRepo.class);
        StudentService studentService = new StudentService(studentRepo);
        Student student1 = new Student("Siegmund");
        Student student2 = new Student("Gerda");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        Mockito.when(studentRepo.findAll()).thenReturn(studentList);
        //When
        Collection<Student> actual = studentService.getStudents();
        //Then
        Assertions.assertThat(actual).isEqualTo(studentList);
    }

    @Test
    void shouldAddStudent(){
        //Given
        StudentRepo studentRepo = Mockito.mock(StudentRepo.class);
        StudentService studentService = new StudentService(studentRepo);
        Student student = new Student("Siegmund");

        //When
        studentService.addStudent(student);

        //Then
        Mockito.verify(studentRepo).save(student);
    }

}