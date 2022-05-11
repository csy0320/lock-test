package cn.jjdcn.lock.locktest.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PreDestroy;
import javax.persistence.*;

public class AbstractListener {
    private static final Logger logger = LoggerFactory.getLogger(AbstractListener.class);

    @PrePersist
    public void prePersist(Object object) {
        logger.debug("prePersis: {}", object);
    }

    @PreUpdate
    public void preUpdate(Object object) {
        logger.debug("preUpdate: {}", object);
    }

    @PreRemove
    public void preRemove(Object object){
        logger.debug("preRemove: {}",object);
    }

    @PreDestroy
    public void preDestroy(Object object){
        logger.debug("preDestroy: {}", object);
    }

    @PostPersist
    public void postPersist(Object object){
        logger.debug("postPersist: {}", object);
    }

    @PostUpdate
    public void postUpdate(Object object) {
        logger.debug("postUpdate: {}", object);
    }

    @PostRemove
    public void postRemove(Object object){
        logger.debug("postRemove: {}",object);
    }

    @PostLoad
    public void postLoad(Object object){
        logger.debug("postLoad: {}", object);
    }

}