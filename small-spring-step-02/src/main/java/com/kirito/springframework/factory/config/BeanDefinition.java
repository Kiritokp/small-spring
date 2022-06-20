package com.kirito.springframework.factory.config;

import lombok.Data;

/**
 * @author kirito
 * @description: 在 Bean 定义类中已经把上一章节中的 Object bean 替换为 Class，这样就可以把 Bean 的实例化操作放到容器中处理了。
 * @date 2022-06-20 13:26
 */
@Data
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass=beanClass;
    }
}
