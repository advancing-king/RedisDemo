package com.my.advance5;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//// 基于spring xml配置方式进行配置加斜杠，类路径下寻找/com/my/advance3/injectLiteralValue.xml
//// injectLiteralValue.xml不加斜杠默认当前包下寻找资源
//@ContextConfiguration(classes=CDConfig.class)
//public class DIDemoTest {
//
//    @Autowired
//    private CDConfig cdConfig;
//    @Autowired
//    private CDPlayerConifg cdPlayerConifg;
//    
//    @Test
//    public void test() {
//        if (cdConfig != null) {
//            CDInterface cd1 = cdConfig.getCD1();
//            if (cd1 != null) {
//                System.out.println("注入成功 ");
//            }
//        }
//        
//        if (cdPlayerConifg != null) {
//            CDPlayerInterface cdPlay1 = cdPlayerConifg.getCDPlayer1();
//            if (cdPlay1 != null) {
//                System.out.println("注入Cdplayer成功 ");
//            }
//        }
//    }
//}

@RunWith(SpringJUnit4ClassRunner.class)
//基于spring xml配置方式进行配置加斜杠，类路径下寻找/com/my/advance3/injectLiteralValue.xml
//injectLiteralValue.xml不加斜杠默认当前包下寻找资源
@ContextConfiguration(classes=TotalConifg.class)
public class DIDemoTest {

 @Autowired
 private TotalConifg totalConifg;
 @Autowired
 private CDConfig cdConfig;
 @Autowired
 private CDPlayerConifg cdPlayerConifg;
 
 @Test
 public void test() {
     Assert.assertNotNull(totalConifg);
     Assert.assertNotNull(cdConfig.getCD1());
     Assert.assertNotNull(cdPlayerConifg.getCDPlayer1());
 }
}