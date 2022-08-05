package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;


public interface ServiceI 
{
public int addstudent(Student student);
public List<Student> getallStudent();
public Student getstudentById();
}
