package dev.lesechko.designpatterns.behavioral.observer;

import java.util.List;

class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have changes in vacancies:\n" + vacancies
                + "\n==========\n");
    }
}
