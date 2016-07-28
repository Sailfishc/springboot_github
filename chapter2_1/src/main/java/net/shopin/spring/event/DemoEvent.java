package net.shopin.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by travis on 2016/7/28.
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
