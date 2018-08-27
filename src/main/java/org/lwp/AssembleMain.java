package org.lwp;

import org.lwp.assembleBean.FirstBean;
import org.lwp.assembleBeanConfig.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AssembleMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        FirstBean firstBean = (FirstBean)annotationConfigApplicationContext.getBean("firstBean");
        firstBean.getSecondBean().say();
    }
}
