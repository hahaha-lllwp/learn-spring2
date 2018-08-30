package org.lwp.profilePackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdProfileConfig {

    @Bean
    public People people(){
        return new People("I am a people of profile named 'prod'");
    }
}
