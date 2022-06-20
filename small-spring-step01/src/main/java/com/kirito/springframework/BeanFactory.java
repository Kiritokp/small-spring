package com.kirito.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author kirito
 * @description: 代表了Bean对象的工厂，可以存放Bean定义到Map中以及获取
 * @date 2022-06-20 10:43
 */
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap= new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
