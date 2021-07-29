package me.erudev.springframework;

import me.erudev.springframework.bean.UserService;

/**
 * @author pengfei.zhao
 * @date 2021/7/29 15:35
 */
public class ApiTest {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
