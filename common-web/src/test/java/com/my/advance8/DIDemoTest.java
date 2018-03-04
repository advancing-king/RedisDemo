package com.my.advance8;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Config.class})
public class DIDemoTest {
    
    @Autowired
    @Qualifier(value="code")
    private Dessert dessert;
    
    @Autowired
    @Qualifier(value="hot")
    private Dessert dessert2;
    
    @Test
    public void test() {
        
        System.out.println(dessert.getClass().getName());
        System.out.println(dessert2.getClass().getName());
    }
}