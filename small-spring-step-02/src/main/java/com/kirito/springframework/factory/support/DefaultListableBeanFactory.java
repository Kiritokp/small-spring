package com.kirito.springframework.factory.support;

import com.kirito.springframework.BeansException;
import com.kirito.springframework.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kirito
 * @description: DefaultListableBeanFactory 继承了 AbstractAutowireCapableBeanFactory 类，
 * 也就具备了接口 BeanFactory 和 AbstractBeanFactory 等一连串的功能实现。所以有时候你会看到一些类的强转，
 * 调用某些方法，也是因为你强转的类实现接口或继承了某些类。
 *
 * 除此之外这个类还实现了接口 BeanDefinitionRegistry 中的 registerBeanDefinition(String beanName, BeanDefinition beanDefinition) 方法，
 * 当然你还会看到一个 getBeanDefinition 的实现，这个方法我们文中提到过它是抽象类 AbstractBeanFactory 中定义的抽象方法。
 * 现在注册Bean定义与获取Bean定义就可以同时使用了，是不感觉这个套路还蛮深的。接口定义了注册，抽象类定义了获取，
 * 都集中在 DefaultListableBeanFactory 中的 beanDefinitionMap 里。。
 * @date 2022-06-20 13:27
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private Map<String,BeanDefinition> beanDefinitionMap=new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition==null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
