package dev.lesechko.designpatterns.behavioral.state;

class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading.");
    }
}
