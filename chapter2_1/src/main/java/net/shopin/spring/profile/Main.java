package net.shopin.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by travis on 2016/7/28.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //设置evioment
        context.getEnvironment().setActiveProfiles("dev");
        //注册Bean
        //如果不设置Environment会出现：NoSuchBeanDefinitionException
        context.register(ProfileConfig.class);
        //刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
