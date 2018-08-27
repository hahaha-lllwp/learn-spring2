package org.lwp.spring;

import org.junit.runner.RunWith;
import org.lwp.assembleBeanConfig.Config;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:application.xml"})
@ContextConfiguration(classes = {Config.class})
public class ParentTest {

}
