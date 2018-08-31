package org.lwp.aopPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
@Configuration
public class AopConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public Performance performance(){
        return new Performance2();
    }

    @Bean
    public Encoreable encoreable(){
        return new DefaultEncoreable();
    }
}
