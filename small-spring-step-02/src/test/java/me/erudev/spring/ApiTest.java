package me.erudev.spring;

import me.erudev.spring.bean.UserService;
import me.erudev.spring.factory.BeanDefinition;
import me.erudev.spring.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

/**
 * @author pengfei.zhao
 * @date 2021/7/30 14:11
 */
public class ApiTest {

    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 第二次获取是从缓存中取到的
        UserService userServiceSingleton = (UserService) beanFactory.getBean("userService");
        userServiceSingleton.queryUserInfo();
    }
}
