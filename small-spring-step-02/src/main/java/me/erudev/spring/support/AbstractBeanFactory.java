package me.erudev.spring.support;

import me.erudev.spring.BeanFactory;
import me.erudev.spring.BeansException;
import me.erudev.spring.factory.BeanDefinition;

/**
 * @author pengfei.zhao
 * @date 2021/7/30 13:48
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String beanName) {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
