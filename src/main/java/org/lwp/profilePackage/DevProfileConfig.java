package org.lwp.profilePackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevProfileConfig {

    @Bean
    public People getPeople(){
        return new People("I am a people of profile named 'dev '");
    }


}
