package cn.jjdcn.lock.locktest.repostory;

import cn.jjdcn.lock.locktest.entity.StudentEntity;
import org.hibernate.annotations.Proxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Proxy(lazy = false)
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}

