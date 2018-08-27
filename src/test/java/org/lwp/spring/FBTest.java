package org.lwp.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class FBTest extends ParentTest{

    @Resource
    private FirstBean fb;

    @Test
    public void first(){
        System.out.println(fb.getName());
    }

}
