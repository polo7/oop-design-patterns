package dev.lesechko.designpatterns.behavioral.observer;

interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
