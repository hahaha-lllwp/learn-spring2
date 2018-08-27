package org.lwp.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.lwp.spring.FirstBean;
import org.lwp.spring.HaveAStream;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@Configurable
@ComponentScan(basePackages = "org.lwp.spring")
@Aspect
public class SpringConfig {

    @Bean
    public FirstBean firstBean(){
        return new FirstBean("小明");
    }

    @Bean
    public HaveAStream haveAStream(){
        return new HaveAStream(System.out);
    }

    @Pointcut("execution(* org.lwp.spring.HaveAStream.sayHello())")
    public void aspect(){}
}
