package cn.jjdcn.lock.locktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LockTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LockTestApplication.class, args);
    }

}
