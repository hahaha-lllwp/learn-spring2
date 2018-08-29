package org.lwp;

import org.lwp.profilePackage.People;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProfileMain {

    public static void main(String[] args) {
//        System.setProperty("spring.profiles.default","dev");
//        System.setProperty("spring.profiles.active","prod");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("profileTest.xml");
        People people = (People)context.getBean("people");
        people.sayMe();
    }
}
