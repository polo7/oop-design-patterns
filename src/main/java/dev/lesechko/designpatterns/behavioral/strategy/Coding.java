package dev.lesechko.designpatterns.behavioral.strategy;

class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Coding.");
    }
}
