package ru.job4j.bmb.services;

import ru.job4j.bmb.content.Content;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

@Service
public class BotCommandHandler implements BeanNameAware {
    void receive(Content content) {
        System.out.println(content);
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println(beanName + " bean has been initialized.");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is going through @PostConstruct init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will be destroyed via @PreDestroy.");
    }
}
