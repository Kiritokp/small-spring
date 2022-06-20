package com.kirito.springframework.factory;

/**
 * @author kirito
 * @description: TODO
 * @date 2022-06-20 13:27
 */
public  interface BeanFactory {
    Object getBean(String name);
}
