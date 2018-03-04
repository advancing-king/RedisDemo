package com.my.advance5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
//@ComponentScan
//当定义多而杂的bean后，我们采用分离的方法配置config类,采用@import注解将两个conifg类合并,测试的时候只需要注入该class即可
//@Import(value=CDPlayerConifg.class)
//public class CDConfig {
//
//    @Bean
//    public CDInterface getCD1() {
//        return new CD1Impl();
//    }
//}

@Configuration
@ComponentScan
public class CDConfig {

    @Bean
    public CDInterface getCD1() {
        return new CD1Impl();
    }
}
