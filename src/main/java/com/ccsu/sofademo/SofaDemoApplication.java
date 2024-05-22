package com.ccsu.sofademo;

import com.alipay.sofa.runtime.api.annotation.SofaAsyncInit;
import com.ccsu.sofademo.beantest.impl.MyBeanImpl1;
import com.ccsu.sofademo.beantest.impl.MyBeanImpl2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SofaDemoApplication {
    //查询如下网址,查看应用 Readiness Check 的状况:http://localhost:8080/actuator/readiness
    //使用如下查询，查看应用的运行时健康状态:    http://localhost:8080/actuator/health
    public static void main(String[] args) {
        SpringApplication.run(SofaDemoApplication.class, args);
    }
    @Bean(value = "myBeanImpl1",initMethod = "init")
    @SofaAsyncInit
    public MyBeanImpl1 myBeanImpl1(){
        return new MyBeanImpl1();
    }
    @Bean(value = "myBeanImpl2",initMethod = "init")
    @SofaAsyncInit
    public MyBeanImpl2 myBeanImpl2(){
        return new MyBeanImpl2();
    }
}
