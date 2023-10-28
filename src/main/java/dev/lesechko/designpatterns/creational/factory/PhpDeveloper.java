package dev.lesechko.designpatterns.creational.factory;

class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code");
    }
}
