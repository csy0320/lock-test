package cn.jjdcn.lock.locktest.controller;

import cn.jjdcn.lock.locktest.entity.Student;
import cn.jjdcn.lock.locktest.repostory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("add")
    public void add(@RequestBody Student student) {
    }
}
