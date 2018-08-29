package org.lwp.profilePackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PeopleProfileConfig {

    @Bean
    @Profile("dev")
    public People getDevPeople(){
        return new People("I am a people of profile named 'dev '");
    }

    @Bean
    @Profile("prod")
    public People getProdPeople(){
        return new People("I am a people of profile named 'prod'");
    }
}
