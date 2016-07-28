package net.shopin.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by travis on 2016/7/28.
 */
@Configuration
@ComponentScan("net.shopin.spring")
@EnableAspectJAutoProxy
public class AspectConfig {

}
