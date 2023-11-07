package dev.lesechko.designpatterns.behavioral.state;

class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping.");
    }
}
