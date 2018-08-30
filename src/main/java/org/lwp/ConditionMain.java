package org.lwp;

import org.lwp.conditionBean.ConditionConfig;
import org.lwp.conditionBean.Man;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        Man man = (Man) context.getBean("man");
        System.out.println(man.name);
    }
}
