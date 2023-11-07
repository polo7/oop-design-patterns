package dev.lesechko.designpatterns.behavioral.visitor;

class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
