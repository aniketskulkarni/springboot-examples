package com.learnwithaniket.springjpa.service;

import com.learnwithaniket.springjpa.model.Students;

import java.util.List;

public interface StudentService {

    List<Students> getAll();

    Students getById(Integer studentId);

    Integer save(Students student);
}
