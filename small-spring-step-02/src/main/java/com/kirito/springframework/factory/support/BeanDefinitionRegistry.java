package com.kirito.springframework.factory.support;

import com.kirito.springframework.factory.config.BeanDefinition;

/**
 * @author kirito
 * @description: TODO
 * @date 2022-06-20 13:27
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
