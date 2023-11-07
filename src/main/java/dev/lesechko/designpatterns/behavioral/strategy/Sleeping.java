package dev.lesechko.designpatterns.behavioral.strategy;

class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping.");
    }
}
