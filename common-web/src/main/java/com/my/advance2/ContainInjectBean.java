package com.my.advance2;

public class ContainInjectBean {

    private InjectBeanInterface injectBeanInterface;
    
    public ContainInjectBean(InjectBeanInterface injectBeanInterface) {
        this.injectBeanInterface = injectBeanInterface;
    }
    
    public InjectBeanInterface getInjectBeanInstance() {
        return injectBeanInterface;
    }
}
