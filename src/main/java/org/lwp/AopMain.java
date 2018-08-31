package org.lwp;

import org.lwp.aopPackage.AopConfig;
import org.lwp.aopPackage.Performance;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AopMain {

    public static void main(String[] args) {
//        annotation();
//        xml();
//        xml2();
//        annotation2();

    }

    private static void annotation2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        Performance performance = (Performance) context.getBean("performance");
        performance.perform();
    }

    private static void xml2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopTest.xml");
        Performance performance = (Performance) context.getBean("performance");
        performance.perform3(1);
    }

    private static void xml() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopTest.xml");
        Performance performance = (Performance) context.getBean("performance");
        performance.perform2();
    }

    private static void annotation() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        Performance performance = (Performance) context.getBean("performance");
        performance.perform();
    }
}
