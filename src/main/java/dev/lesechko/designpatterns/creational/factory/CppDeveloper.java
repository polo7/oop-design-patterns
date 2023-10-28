package dev.lesechko.designpatterns.creational.factory;

class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code");
    }
}
