package com.my.advance3;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//基于spring xml配置方式进行配置加斜杠，类路径下寻找/com/my/advance3/injectLiteralValue.xml
//injectLiteralValue.xml不加斜杠默认当前包下寻找资源
@ContextConfiguration(locations = {"injectLiteralValue.xml"})
public class DIDemoTest {
    
//    <!-- 借助id我们可以更方便引用bean -->
//    <bean class="com.my.advance3.InjectBean" id="injectBean">
//    <!-- 使用构造器注入，前提是必须包含带参构造,参数个数要与传入参数顺序类型要保持一致 -->
//    <!-- 没有相应的带参构造要报错。 -->
//        <constructor-arg value="Simon" type="String"></constructor-arg>
//        <constructor-arg value="23" type="int"></constructor-arg>
//    </bean>
//    @Autowired
//    private InjectBean injectBean;
//    
//    @Test
//    public void test(){
//        Assert.assertNotNull(injectBean);
//        System.out.println(injectBean.getMyName() + "---" + injectBean.getAge());
//    } 
    
    
//    <bean class="com.my.advance3.InjectBean" id="injectBean1">
//    <!-- 使用构造器注入，前提是必须包含带参构造,参数个数要与传入参数顺序类型要保持一致 -->
//        <constructor-arg value="mr wang" type="String"></constructor-arg>
//        <constructor-arg value="23" type="int"></constructor-arg>
//    </bean>
//    @Autowired
//    @Qualifier(value = "injectBean1")
//    private InjectBean injectBean;
//    
//    @Test
//    public void test(){
//        Assert.assertNotNull(injectBean);
//        System.out.println(injectBean.getMyName() + "---" + injectBean.getAge());
//    } 
    
//    <!-- 用property不能有构造器,要报错，不知道为啥 -->
//    <bean class="com.my.advance3.InjectBean" id="injectBean2">
//        <property name="title" value= "wang"></property>
//        <property name="age" value="23"></property>
//    </bean>
//    @Autowired
//    @Qualifier(value = "injectBean2")
//    private InjectBean injectBean;
//    
//    @Test
//    public void test(){
//        Assert.assertNotNull(injectBean);
//        System.out.println(injectBean.getTitle() + "---" + injectBean.getAge());
//    } 
    
//        @Autowired
//      @Qualifier(value = "injectBean3")
//      private InjectBean injectBean;
//      
//      @Test
//      public void test(){
//          Assert.assertNotNull(injectBean);
//          System.out.println(injectBean.getTitle() + "---" + injectBean.getAge());
//          List<String> list = injectBean.getList();
//          if (list != null && list.size() > 0) {
//              for (String string : list) {
//                System.out.println(string);
//            }
//          }
//      }
    
    @Autowired
    private ContainInjectBeans containInjectBeans;
    
    @Test
    public void test(){
        Assert.assertNotNull(containInjectBeans);
        
        List<InjectBeanInterface> list = containInjectBeans.getList();
        if (list != null && list.size() > 0) {
            for (InjectBeanInterface bean : list) {
                System.out.println(bean.getClass().getName());
          }
        }
    }
}
