package org.lwp.aopPackage;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

    //通过pointcut声明频繁使用的切入点
    @Pointcut("execution(* org.lwp.aopPackage.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silencePhone(){
        System.out.println("Every audience silence phone");
    }

    @After("performance()")
    public void leave(){
        System.out.println("Every audience leave their seats");
    }

    @AfterReturning("performance()")
    public void leaveSeats(){
        System.out.println("Every audience leave their seats after returning");
    }
    @AfterThrowing("performance()")
    public void exception(){
        System.out.println("This perform has accidence happened");
    }

    @Around("performance()")
    public void handClap(){
        System.out.println("Everyone hand clap");
    }
}
