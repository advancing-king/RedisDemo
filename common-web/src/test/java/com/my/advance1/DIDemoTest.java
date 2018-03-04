package com.my.advance1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration Spring整合JUnit4测试时，使用注解引入多个配置文件
@ContextConfiguration(classes=DiConfig.class)
public class DIDemoTest {
    
    //如果没有自动寻找到匹配的bean，required默认为true会抛出未找到匹配的bean的异常,
    //设置为false可以避免异常，不过要避免没有匹配到bean而为空的风险 
    //如果有多个bean满足依赖关系 ,spring会抛出一个异常
    //与@inject注解类似，inject注解是
//    @Autowired(required = false)
//    private DIDemo diDemo;
    @Autowired
    private DiConfig diConfig;
//    @Test
//    public void methodTest(){
//        if (diDemo != null) {
//            Assert.assertNotNull(diDemo);
//        }
//    }
    
    @Test
    public void methodTest2(){
        if (diConfig != null) {
            Assert.assertNotNull(diConfig);
            DIDemo diDemo = diConfig.getter();
            DIDemo diDemo2 = diConfig.getter();
            Assert.assertNotNull(diDemo);
            /*
             * @Bean
             *public DIDemo getter() {
             *     return new DIDemoImpl();
             *   }
             *   方法返回的bean
             */
            
            Assert.assertEquals(diDemo, diDemo2);
            System.out.println(diConfig.getRandomImpl().getClass().getName());
        }
    }
    
//    @Test
//    //不管是构造器还是set方法还是其他方法，spring都会尝试满足方法参数上所声明的依赖
//    public void nullTest(DIDemo diDemo){
//        if (diDemo == null) {
//            System.out.println("为空");
//        }
//    }
}
