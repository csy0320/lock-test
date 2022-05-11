package cn.jjdcn.lock.locktest;

import cn.jjdcn.lock.locktest.entity.StudentEntity;
import cn.jjdcn.lock.locktest.repostory.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class LockTestApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void add() {
        studentRepository.save(StudentEntity.builder().name("王五").age(100).description("").build());
    }

    @Test
    void update() {
        StudentEntity studentEntity = studentRepository.getById(5L);
        studentEntity.setAge(20);
        studentEntity.setUpdateTime(LocalDateTime.now().plusDays(1L));
        studentRepository.save(studentEntity);
    }

    @Test
    void test() {
        System.out.println("LocalDateTime.now().plusDays(1L) = " + LocalDateTime.now().plusDays(1L));
    }
}
