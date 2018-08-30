package org.lwp.profilePackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevProfileConfig {


    @Bean("people")//获取到的bean的id与方法名一致，在bean注解值里声明会覆盖方法所代表的值
    public People people(){
        return new People("I am a people of profile named 'dev '");
    }

}

