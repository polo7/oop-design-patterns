package dev.lesechko.designpatterns.creational.factory;

class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code");
    }
}