package com.kirito.springframework.factory.config;

/**
 * @author kirito
 * @description: 定义了一个获取单例对象的接口
 * @date 2022-06-20 13:26
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
