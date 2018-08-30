package org.lwp;

import org.lwp.profilePackage.DevProfileConfig;
import org.lwp.profilePackage.People;
import org.lwp.profilePackage.PeopleProfileConfig;
import org.lwp.profilePackage.ProdProfileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProfileMain {

    public static void main(String[] args) {
        xmlProfile();
        annotationProfile(DevProfileConfig.class);
        System.setProperty("spring.profiles.active","prod");
        annotationProfile(ProdProfileConfig.class);
        annotationProfile(PeopleProfileConfig.class);
    }

    private static void annotationProfile(Class<?> clazz) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(clazz);
        People people = (People) context.getBean("people");
        people.sayMe();
    }


    private static void xmlProfile() {
        //        System.setProperty("spring.profiles.default","dev");
//        System.setProperty("spring.profiles.active","prod");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("profileTest.xml");
        People people = (People)context.getBean("people");
        people.sayMe();
    }
}
