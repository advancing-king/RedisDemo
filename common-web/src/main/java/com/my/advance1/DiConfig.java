package com.my.advance1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//java配置类的关键在于 @Configuration,表明该类是一个配置类,该类应该包含在spring应用上下文中如何创建bean的细节
@Configuration
//@ComponentScan
//扫描类所在的包
@ComponentScan(basePackageClasses=DIDemo.class)
//报名为基础包,传入数组
//@ComponentScan(basePackages={"com.my.advance1"})
public class DiConfig {
    
    //该注解会告诉spring这个方法将会返回一个对象,该对象注册为spring应用上下问中的bean。
    //默认情况下，bean的id与方法名一样,也可以通过name指定不同的名字
    //默认情况下spring中注入的bean都是单例的
    @Bean
    public DIDemo getter() {
        return new DIDemoImpl();
    }
    
    @Bean
    public DIDemo getRandomImpl() {
       int i = (int) Math.floor(Math.random() * 3) + 1;
       if (i == 1) {
           return new DIDemoImpl();
       } else if (i == 2) {
           return new DIDemoImpl2();
       } else {
           return new DIDemoImpl3();  
       }
       }
}
