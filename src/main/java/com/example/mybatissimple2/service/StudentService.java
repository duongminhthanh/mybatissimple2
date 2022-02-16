package com.example.mybatissimple2.service;

import com.example.mybatissimple2.model.Student;

import java.util.List;

public interface StudentService {
    public int insertStudent(Student student);
    public int updateStudentById(int studentId);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    public int countAll();
}
