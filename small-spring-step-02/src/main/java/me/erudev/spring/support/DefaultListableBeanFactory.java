package me.erudev.spring.support;

import me.erudev.spring.BeanFactory;
import me.erudev.spring.BeansException;
import me.erudev.spring.factory.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengfei.zhao
 * @date 2021/7/30 14:04
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }
}
