package dev.lesechko.designpatterns.behavioral.strategy;

class Reading implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Reading.");
    }
}
