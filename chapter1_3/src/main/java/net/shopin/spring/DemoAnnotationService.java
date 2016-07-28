package net.shopin.spring;

import org.springframework.stereotype.Service;

/**
 * Created by travis on 2016/7/28.
 */
@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作")
    public void add(){}
}
