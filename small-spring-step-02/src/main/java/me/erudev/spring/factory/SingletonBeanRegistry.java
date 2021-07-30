package me.erudev.spring.factory;

/**
 * @author pengfei.zhao
 * @date 2021/7/30 13:40
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
