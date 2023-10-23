package dev.lesechko.designpatterns.theory.factory;

class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code");
    }
}
