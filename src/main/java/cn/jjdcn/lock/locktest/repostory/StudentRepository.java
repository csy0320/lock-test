package cn.jjdcn.lock.locktest.repostory;

import cn.jjdcn.lock.locktest.entity.Student;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class StudentRepository extends SimpleJpaRepository<Student, Long> {
    public StudentRepository(JpaEntityInformation<Student, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }
}

