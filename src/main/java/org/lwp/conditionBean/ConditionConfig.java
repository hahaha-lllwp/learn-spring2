package org.lwp.conditionBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(LoadManCondition.class)
    @Primary//设置为同名bean时的首选项 也可在配置文件的bean标签中声明 primary=true 即可
//    @Scope(ScopedProxyMode.DEFAULT)
    public Man man(){
        Man man = new Man();
        man.name = "小明";
        return man;
    }

}
