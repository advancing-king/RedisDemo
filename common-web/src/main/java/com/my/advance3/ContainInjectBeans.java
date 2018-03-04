package com.my.advance3;

import java.util.List;

public class ContainInjectBeans {

    private List<InjectBeanInterface> list;
    
    public ContainInjectBeans(List<InjectBeanInterface> list) {
        this.list = list;
    }

    public List<InjectBeanInterface> getList() {
        return list;
    }

    public void setList(List<InjectBeanInterface> list) {
        this.list = list;
    }
    
}
