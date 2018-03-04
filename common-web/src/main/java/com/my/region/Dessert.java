package com.my.region;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public interface Dessert {

}
/*
 * @Qualifier作为所引用bean的bean要具有String类型作为限定符，如果没有指定其他的限定符
 * 所有bean都会给定一个默认的限定符，与bean的id相同
 * 我们可以创建自定义限定符，而不是依赖beanID，所需要做的就是在bean声明上添加@Qualifier注解，例如可以与@Component组合使用
 * 或者直接给@Component定义一个id  为code的实例，
 */
@Component("code")
//@Qualifier(value="code")
class IceCream implements Dessert {
    
}

@Component
@Qualifier(value="hot")
class Coffee implements Dessert {
    
}
