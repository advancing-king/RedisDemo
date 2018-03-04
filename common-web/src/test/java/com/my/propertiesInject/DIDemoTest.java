package com.my.propertiesInject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Config.class})
public class DIDemoTest {
    
    @Autowired
    private Config config;
    
    
    @Test
    public void test(){
        
        if (config != null) {
            IceCream cream = config.getIceCream();
            System.out.println(cream.getName()+"--"+cream.getPrice());
            IceCream cream2 = config.getIceCream2();
            System.out.println(cream2.getName()+"--"+cream2.getPrice());
        }
    }
}