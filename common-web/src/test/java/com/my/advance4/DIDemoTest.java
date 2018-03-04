package com.my.advance4;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 基于spring xml配置方式进行配置加斜杠，类路径下寻找/com/my/advance3/injectLiteralValue.xml
// injectLiteralValue.xml不加斜杠默认当前包下寻找资源
@ContextConfiguration(locations = { "propertySetConfig.xml" })
public class DIDemoTest {

    // <!-- 如果InjectBean没有写带参构造，只写一个<bean class="com.my.advance4.InjectBean"
    // id="injectBean">
    // </bean>测试注入时候没有问题，但是其中的属性是为null或者0
    // -->
    // <bean class="com.my.advance4.InjectBean" id="injectBean">
    // </bean>
    // @Autowired
    // private InjectBean injectBean;
    //
    // @Test
    // public void test() {
    // Assert.assertNotNull(injectBean);
    // }

    // <bean id="injectBean" class="com.my.advance4.InjectBean">
    // <!-- property元素为属性的setter方法所提供的功能与constructor-arg元素构造器所提供的功能是一样的 -->
    // <property name="name" value="wangchaoqian"></property>
    // <property name="title" value="霸王条款"></property>
    // <property name="age" value="24"></property>
    // <property name="list">
    // <list>
    // <value>123</value>
    // <value>www</value>
    // <value>zxd</value>
    // </list>
    // </property>
    // </bean>
    // @Autowired
    // private InjectBean injectBean;
    //
    // @Test
    // public void test() {
    // Assert.assertNotNull(injectBean);
    // System.out.println(injectBean.getName() + "--" + injectBean.getTitle() +
    // "--" + injectBean.getAge());
    // List<String> list = injectBean.getList();
    // if (list != null && list.size() > 0) {
    // for (String string : list) {
    // System.out.println(string);
    // }
    // }
    // }

//    @Autowired
//    private ContainInjectBeans containInjectBeans;
//
//    @Test
//    public void test() {
//        Assert.assertNotNull(containInjectBeans);
//        List<InjectBeanInterface> list = containInjectBeans.getList();
//        if (list != null && list.size() > 0) {
//            for (InjectBeanInterface bean : list) {
//                System.out.println(bean.getClass().getName());
//            }
//        }
//    }

    @Resource(name="list")
    private List<InjectBeanInterface> lists;

    @Test
    public void test() {
        List<InjectBeanInterface> list = lists;
        if (list != null && list.size() > 0) {
            for (InjectBeanInterface bean : list) {
                System.out.println(bean.getClass().getName());
            }
        }
    }
}
