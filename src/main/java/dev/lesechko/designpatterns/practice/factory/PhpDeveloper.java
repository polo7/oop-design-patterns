package dev.lesechko.designpatterns.practice.factory;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code");
    }
}
