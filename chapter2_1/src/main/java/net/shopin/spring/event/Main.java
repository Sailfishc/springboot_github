package net.shopin.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by travis on 2016/7/28.
 */

/**
 * 思路：
 *  1、自定义事件继承ApplicationEvent
 *  2、自定义事件监听器，实现ApplicationListener
 *  3、使用容器发布事件
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher bean = context.getBean(DemoPublisher.class);
        bean.publish("hello applicaton event");
        context.close();
    }
}
