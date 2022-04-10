package com.learnwithaniket.springjpa.service.impl;

import com.learnwithaniket.springjpa.model.Students;
import com.learnwithaniket.springjpa.repository.StudentRepository;
import com.learnwithaniket.springjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Students> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Students getById(Integer studentId) {
        Optional<Students> studentsOptional = studentRepository.findById(studentId);
        return studentsOptional.isPresent() == true ? studentsOptional.get() : new Students();
    }

    @Override
    public Integer save(Students student) {
        return studentRepository.save(student).getStudentId();
    }
}
