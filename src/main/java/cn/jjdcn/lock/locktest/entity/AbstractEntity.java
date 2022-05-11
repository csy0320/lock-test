package cn.jjdcn.lock.locktest.entity;

import cn.jjdcn.lock.locktest.listener.AbstractListener;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners({AbstractListener.class, AuditingEntityListener.class})
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @CreatedDate
    @Column(name = "insert_time", updatable = false)
    private LocalDateTime insertTime;

    @LastModifiedDate
    @Column(name = "update_time")
    private LocalDateTime  updateTime;


}



