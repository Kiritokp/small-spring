package test.ApiTest;

import com.kirito.springframework.factory.config.BeanDefinition;
import com.kirito.springframework.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;
import test.bean.UserService;

/**
 * @author kirito
 * @description: TODO
 * @date 2022-06-20 10:56
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("UserService",beanDefinition);
        //第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();
        //第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("UserService");
        userService_singleton.queryUserInfo();
    }
}
