package net.shopin.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by travis on 2016/7/28.
 */
@Configuration
public class ProfileConfig {


    @Bean
    @Profile("dev")
    public DemoBean devBean() {
        return new DemoBean("from dev profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodBean() {
        return new DemoBean("from prod profile");
    }
}
