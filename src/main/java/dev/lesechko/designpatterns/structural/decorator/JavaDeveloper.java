package dev.lesechko.designpatterns.structural.decorator;

class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write Java code.";
    }
}
