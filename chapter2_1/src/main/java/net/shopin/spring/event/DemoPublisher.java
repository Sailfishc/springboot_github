package net.shopin.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by travis on 2016/7/28.
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
