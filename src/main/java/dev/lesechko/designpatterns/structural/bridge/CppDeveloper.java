package dev.lesechko.designpatterns.structural.bridge;

class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes code.");
    }
}
