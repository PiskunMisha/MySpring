package ua.piskun.springcourse;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("My init");
    }

    @PreDestroy  // Цей метод буде викликано перед знищенням біба
    public void doMyDestroy() {
        System.out.println("My destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}