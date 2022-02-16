package com.example.mybatissimple2.controller;

import com.example.mybatissimple2.model.Student;
import com.example.mybatissimple2.service.StudentService;
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
    public int insertStudent(@RequestBody Student student) {
        return studentService.insertStudent(student);
    }

    /*update*/
    @RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public int updateStudentById(@PathVariable int id) {
        return studentService.updateStudentById(id);
    }

    /*delete*/
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteStudentById(@PathVariable int id) {
        return studentService.deleteStudentById(id);
    }
    /*list all*/
    @RequestMapping(value = "/students",method = RequestMethod.GET)
    @ResponseBody
    public List<Student> selectAllStudent() {
        return studentService.selectAllStudent();
    }
    /*list by id*/
    @RequestMapping(value = "/students/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Student selectStudentById(@PathVariable int id){
        return studentService.selectStudentById(id);
    }
    /*count all*/
    @RequestMapping(value = "/count",method = RequestMethod.GET)
    @ResponseBody
    public int countAll(){
        return studentService.countAll();
    }
}

