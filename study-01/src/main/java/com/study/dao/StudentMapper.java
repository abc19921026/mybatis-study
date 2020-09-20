package com.study.dao;

import com.study.model.Student;

import java.util.List;

public interface StudentMapper {

    Student selectById(Integer id);

    List<Student> selectList();
}
