package net.shopin.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by travis on 2016/7/28.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();

        System.out.println("接收到了:" + msg);
    }
}
