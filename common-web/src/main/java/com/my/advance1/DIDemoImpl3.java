package com.my.advance1;

import org.springframework.stereotype.Component;

@Component
public class DIDemoImpl3 implements DIDemo {

    @Override
    public void method() {
        System.out.println("impl3");
    }

}
