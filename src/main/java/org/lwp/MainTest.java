package org.lwp;

import org.lwp.config.SpringConfig;
import org.lwp.spring.FirstBean;
import org.lwp.spring.HaveAStream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
//        classPathXml();
//        systemPathXml();
        annotionConfigClass();
    }

    private static void classPathXml() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        FirstBean firstBean = (FirstBean) context.getBean("firstBean");
        System.out.println(firstBean.getName());

        HaveAStream haveAStream = (HaveAStream) context.getBean("haveAStream");
        haveAStream.sayHello();
        haveAStream.getPs().print(1);
    }

    private static void systemPathXml(){
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\lwp\\Desktop\\workspaces\\kmlworkspace\\learn_spring\\src\\main\\resources\\application.xml");
        FirstBean firstBean = (FirstBean) context.getBean("firstBean");
        System.out.println(firstBean.getName());

        HaveAStream haveAStream = (HaveAStream) context.getBean("haveAStream");
        haveAStream.sayHello();
        haveAStream.getPs().print(1);
    }

    private static void annotionConfigClass(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        FirstBean firstBean = (FirstBean) context.getBean("firstBean");
        System.out.println(firstBean.getName());

        HaveAStream haveAStream = (HaveAStream) context.getBean("haveAStream");
        haveAStream.sayHello();
//        haveAStream.getPs().print(1);
    }
}
