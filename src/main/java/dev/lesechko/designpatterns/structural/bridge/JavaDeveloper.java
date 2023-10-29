package dev.lesechko.designpatterns.structural.bridge;

class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java developer writes code.");
    }
}
