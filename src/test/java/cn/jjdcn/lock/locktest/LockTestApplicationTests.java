package cn.jjdcn.lock.locktest;

import cn.jjdcn.lock.locktest.entity.StudentEntity;
import cn.jjdcn.lock.locktest.repostory.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class LockTestApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void add() throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100000; i++) {
            service.submit(() -> {
                studentRepository.save(StudentEntity.builder().name("王五").age(10).description("").build());
            });
        }
        service.awaitTermination(30L, TimeUnit.SECONDS);
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
