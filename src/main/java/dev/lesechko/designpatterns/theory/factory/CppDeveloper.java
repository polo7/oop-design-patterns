package dev.lesechko.designpatterns.theory.factory;

class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code");
    }
}
