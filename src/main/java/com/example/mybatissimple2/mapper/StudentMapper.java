package com.example.mybatissimple2.mapper;

import com.example.mybatissimple2.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface StudentMapper {
    public int insertStudent(Student student);
    public int updateStudentById(int studentId);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    public int countAll();
}

