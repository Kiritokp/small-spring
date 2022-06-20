package com.kirito.springframework;

/**
 * @author kirito
 * @description: 用于定义Bean实例化信息，现在的实现是以Object存放对象
 * @date 2022-06-20 10:43
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean){
        this.bean=bean;
    }


    public Object getBean(){
        return bean;
    }
}
