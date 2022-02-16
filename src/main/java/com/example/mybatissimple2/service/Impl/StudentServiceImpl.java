package com.example.mybatissimple2.service.Impl;

import com.example.mybatissimple2.mapper.StudentMapper;
import com.example.mybatissimple2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired
StudentMapper studentMapper;
    /*method*/

    public StudentServiceImpl() {
        super();
    }

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public int updateStudentById(int studentId) {
        return studentMapper.updateStudentById(studentId);
    }

    @Override
    public int deleteStudentById(int studentId) {
        return studentMapper.deleteStudentById(studentId);
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public int selectStudentById(int studentId) {
        return studentMapper.deleteStudentById(studentId);
    }

    @Override
    public int countAll() {
        return studentMapper.countAll();
    }
}
