package com.my.region;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
@ComponentScan(basePackageClasses={Dessert.class})
public class Config {

    /*
     * @Scope可以和@Component或@Bean一起使用
     * @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)或者@Scope("prototype")都可以
     */
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Dessert getIceCream() {
        return new IceCream();
    }
    
    @Bean
    public Dessert getCoffee() {
        return new Coffee();
    }

    /*
     * WebApplicationContext.SCOPE_SESSION会告诉Spring为web应用中的每个会话创建一个shoppingCart
     * 对于给定的会话将会只创建一个实例，不用用户使用的是不同实例，
     * proxyMode属性用于解决实例化set传入参数时候，此时会话bean还没有被创建，此时需要注入代理bean
     * 为TARGET_CLASS时候此时该会话bean为类，为INTERFACES时候，此会话bean为接口
     * 也可以在xml中配置
     * 
     * <bean id= "" class= "" scpoe="session" >
     *  <aop:scoped-proxy proxy-target-class="true"></aop>
     * </bean>
     * proxy-target-class为false时候，相当于显示设置ScopedProxyMode.INTERFACES
     */
    @Bean
    @Scope(value=WebApplicationContext.SCOPE_SESSION,
    proxyMode=ScopedProxyMode.TARGET_CLASS)
    public ShoppingCart getShoppingCart() {
        return new ShoppingCart();
    }
}
