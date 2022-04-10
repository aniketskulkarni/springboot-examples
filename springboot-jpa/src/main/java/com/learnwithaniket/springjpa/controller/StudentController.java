package com.learnwithaniket.springjpa.controller;

import com.learnwithaniket.springjpa.model.Students;
import com.learnwithaniket.springjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "students/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Students> getAll() {
        return studentService.getAll();
    }

    @GetMapping(value = "{id}")
    public Students getById(@PathVariable(name = "id") final Integer studentId) {
        return studentService.getById(studentId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_HTML_VALUE)
    public Integer save(@RequestBody Students student){
        return studentService.save(student);
    }
}
