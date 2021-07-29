package me.erudev.springframework;

/**
 * @author pengfei.zhao
 * @date 2021/7/29 15:36
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
