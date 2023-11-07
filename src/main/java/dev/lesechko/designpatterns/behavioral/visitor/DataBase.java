package dev.lesechko.designpatterns.behavioral.visitor;

class DataBase implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
