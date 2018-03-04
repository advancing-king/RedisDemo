package com.my.propertiesInject;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(encoding="UTF-8",value="classpath:/com/my/propertiesInject/attrProperties.properties")
public class Config {

    @Autowired
    private Environment environment;
    
    @Bean
    public IceCream getIceCream() {
        return new IceCream("哈根达斯",new BigDecimal(55.5));
    }
    
    
    @Bean
    public IceCream getIceCream2(){
        return new IceCream(environment.getProperty("ice.name"),
                        new BigDecimal(environment.getProperty("ice.price")));
    }
}
