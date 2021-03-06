package net.shopin.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by travis on 2016/7/28.
 */
@Component
@ConfigurationProperties(prefix = "book", locations = {"classpath:config/author.properties"})
public class AuthorSettings {

    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
