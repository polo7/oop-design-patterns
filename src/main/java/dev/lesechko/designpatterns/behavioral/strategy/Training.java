package dev.lesechko.designpatterns.behavioral.strategy;

class Training implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Training.");
    }
}
