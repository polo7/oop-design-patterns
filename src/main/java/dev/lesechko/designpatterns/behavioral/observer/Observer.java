package dev.lesechko.designpatterns.behavioral.observer;

import java.util.List;

interface Observer {
    void handleEvent(List<String> vacancies);
}
