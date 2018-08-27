package org.lwp.assembleBeanConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//不做配置 默认扫码同包下的注解组件
@ComponentScan(basePackages = {"org.lwp.assembleBean"})
public class Config {
}
