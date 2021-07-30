package me.erudev.spring.support;

import me.erudev.spring.BeansException;
import me.erudev.spring.factory.BeanDefinition;

/**
 * @author pengfei.zhao
 * @date 2021/7/30 13:57
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
