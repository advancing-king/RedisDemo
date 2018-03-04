package com.my.advance6;

import java.math.BigDecimal;
import java.util.List;

public class CDPlayer {
    private String name;
    private BigDecimal price;
    private List<String> list;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    
}
