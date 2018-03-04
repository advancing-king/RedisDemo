package com.my.advance5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConifg {

    @Bean
    public CDPlayerInterface getCDPlayer1() {
        return new CDPlayer1Impl();
    }
}
