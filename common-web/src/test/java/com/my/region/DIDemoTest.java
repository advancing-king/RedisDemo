package com.my.region;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Config.class})
public class DIDemoTest {
    
    @Autowired
    private Config config;
    
    
    @Test
    public void test() {
        
        if (config != null) {
            Assert.assertNotEquals(config.getIceCream(), config.getIceCream());
            Assert.assertEquals(config.getCoffee(), config.getCoffee());
        }
    }
}