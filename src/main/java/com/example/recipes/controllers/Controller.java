package com.example.recipeapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public String projectName = "Сайт рецептов";
    public String functions = "Какие-то";
    public String technologies = "Какие-то";
    public String language = "Java 11";
    public String studentName = "Булат";
    public String projectDate = "16.12.22";

    @GetMapping
    public String start() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        return "Имя ученика: " + studentName + "<br>" +
                "Название проекта: " + projectName + "<br>" +
                "Дата создания проекта: " + projectDate + "<br>" +
                "Описание: " + "<br>" +
                "Проект " + projectName + " имеет " + functions + " функции и использует " + technologies + " технологии. Написан на языке " + language;
    }
}
