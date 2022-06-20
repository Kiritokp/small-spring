package com.kirito.test.ApiTest;

import com.kirito.springframework.BeanDefinition;
import com.kirito.springframework.BeanFactory;
import com.kirito.test.bean.UserService;
import org.junit.jupiter.api.Test;

/**
 * @author kirito
 * @description: TODO
 * @date 2022-06-20 10:56
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("UserService",beanDefinition);

        //获取Bean
        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();
    }
}
