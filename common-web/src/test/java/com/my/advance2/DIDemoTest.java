package com.my.advance2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.advance1.DIDemo;
import com.my.advance1.DiConfig;

@RunWith(SpringJUnit4ClassRunner.class)
//基于spring xml配置方式进行配置
@ContextConfiguration(locations = {"/simpleIOC.xml"})
public class DIDemoTest {
    
    @Autowired
    @Qualifier(value = "containInjectBean")
    private ContainInjectBean containInjectBean1;
    
    @Test
    public void test(){
        Assert.assertNotNull(containInjectBean1);
//        Assert.assertNotNull(containInjectBean);
        
    }
}
