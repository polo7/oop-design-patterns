package dev.lesechko.designpatterns.behavioral.visitor;

class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
