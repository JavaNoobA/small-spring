package me.erudev.spring.support;

import me.erudev.spring.factory.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengfei.zhao
 * @date 2021/7/30 13:41
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
