package ua.piskun.springcourse;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("My init");
    }

    @PreDestroy  // Цей метод буде викликано перед знищенням біба
    public void doMyDestroy() {
        System.out.println("My destroy");
    }


    public String getSong() {
        return "Hungarian Rhapsody";
    }
}