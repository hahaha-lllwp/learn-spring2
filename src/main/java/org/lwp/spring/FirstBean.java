package org.lwp.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Configurable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Aspect
public class FirstBean {
    private String name;

    @After("pointCut()")
    @Before("pointCut()")
    public void sayYou() {
        System.out.println(name);
    }

    @Pointcut("execution(* org.lwp.spring.HaveAStream.sayHello(..))")
    public void pointCut() {

    }
}
