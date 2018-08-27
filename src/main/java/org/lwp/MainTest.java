package org.lwp;

import org.lwp.spring.FirstBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        FirstBean firstBean = (FirstBean) context.getBean("firstBean");
        System.out.println(firstBean.getName());
    }
}
