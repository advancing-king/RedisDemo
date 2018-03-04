package com.my.advance7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    @Profile(value="dev")
    public Student getDev() {
        return new DevStudent();
    }
    
    @Bean
    @Profile(value="produce")
    public Student getPro() {
        return new ProStudent();
    }
}
