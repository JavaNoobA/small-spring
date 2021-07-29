package me.erudev.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author pengfei.zhao
 * @date 2021/7/29 15:36
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    public void registerBeanDefinition(String beanName, BeanDefinition bean) {
        beanDefinitionMap.put(beanName, bean);
    }

}
