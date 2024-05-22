package com.ccsu.sofademo.beantest.impl;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

@Slf4j
public class MyBeanImpl2 {
    @PostConstruct
    public void init(){
        log.info("MyBeanImpl2初始化了");
        log.info("MyBeanImpl2 init ThreadName:{}",Thread.currentThread().getName());
    }
}
