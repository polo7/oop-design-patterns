package dev.lesechko.designpatterns.behavioral.state;

class Training implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Training.");
    }
}
