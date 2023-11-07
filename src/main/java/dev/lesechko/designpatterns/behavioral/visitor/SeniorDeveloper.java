package dev.lesechko.designpatterns.behavioral.visitor;

class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after Junior.");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Fixing DB.");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test.");
    }
}
