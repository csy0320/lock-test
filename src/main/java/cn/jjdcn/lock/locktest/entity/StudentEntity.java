package cn.jjdcn.lock.locktest.entity;

import lombok.*;
import org.hibernate.annotations.Proxy;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Proxy(lazy = false)
public class StudentEntity extends AbstractEntity {

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String description;

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + getId() +
                ", insertTime='" + getInsertTime() + '\'' +
                ", updateTime='" + getUpdateTime() + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
