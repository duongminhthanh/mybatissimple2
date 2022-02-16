package com.example.mybatissimple2.controller;

import com.example.mybatissimple2.model.Student;
import com.example.mybatissimple2.service.Impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    /*request*/
    /*create*/
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public int insertStudent(Student student) {
        return studentService.insertStudent(student);
    }

    /*update*/
    @RequestMapping(value = "/update/id",method = RequestMethod.PUT)
    @ResponseBody
    public int updateStudentById(int studentId) {
        return studentService.updateStudentById(studentId);
    }

    /*delete*/
    @RequestMapping(value = "/delete/id",method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteStudentById(int studentId) {
        return studentService.deleteStudentById(studentId);
    }
    /*list all*/
    @RequestMapping(value = "/all",method = RequestMethod.DELETE)
    @ResponseBody
    public List<Student> selectAllStudent() {
        return studentService.selectAllStudent();
    }
    /*list by id*/
    @RequestMapping(value = "/id",method = RequestMethod.GET)
    @ResponseBody
    public int selectStudentById(int studentId){
        return studentService.selectStudentById(studentId);
    }
    /*count all*/
    @RequestMapping(value = "/count",method = RequestMethod.GET)
    @ResponseBody
    public int countAll(){
        return studentService.countAll();
    }
}

