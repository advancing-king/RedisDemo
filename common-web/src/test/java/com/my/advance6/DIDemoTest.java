package com.my.advance6;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=TotalConifg.class)
//public class DIDemoTest {
//
//    @Autowired
//    private CDConfig cdConfig;
//    @Autowired
//    private MusicPlayer musicPlayer;
//    
//    @Test
//    public void test() {
//        Assert.assertNotNull(cdConfig.getCD1());
//        
//        if (musicPlayer != null) {
//            System.out.println(musicPlayer.getName());
//            System.out.println(musicPlayer.getType());
//            System.out.println(musicPlayer.getPrice());
//            List<String> list = musicPlayer.getList();
//            if (list != null && list.size() > 0) {
//                for (String str : list) {
//                    System.out.println(str);
//                }
//            }
//         }
//    }
//}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"totalInject.xml"})
public class DIDemoTest {

    @Autowired
    private MusicPlayer musicPlayer;
    @Autowired
    private CD1Impl cd1Impl;
    
    @Test
    public void test() {
        Assert.assertNotNull(musicPlayer);
        Assert.assertNotNull(cd1Impl);
    }
}