package com.my.advance7;

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
@ActiveProfiles(value="produce")
public class DIDemoTest {
    /**
     * Spring在确定哪个profile处于激活状态时，需要依赖两个独立的属性：spring.profile.active和spring.profile.default
     * 如果设置了spring.profile.active，那么他的值就会确定被激活的profile是谁，如果没设置就查找default的值,
     * 如果两者都没有设置，那么就没有激活的profile，只激活那些没有profile中的bean
     * 有多种方式来设置这两个属性：
     * 1.作为DispatcherServlet的初始化参数
     * 2.作为Web应用上下文参数
     * 3.作为JNDI条目
     * 4.环境变量
     * 5.JVM系统参数
     * 6.在继承测试类上，使用@ActiveProfile注解
     */
    private Config config;
    
    @Test
    public void test() {
        Student student = config.getPro();
        System.out.println(student.getName());
        
//        Student student2 = config.getDev();
//        System.out.println(student2.getName());
    }
}