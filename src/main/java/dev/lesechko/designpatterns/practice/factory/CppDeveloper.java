package dev.lesechko.designpatterns.practice.factory;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code");
    }
}
