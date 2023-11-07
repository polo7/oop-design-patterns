package dev.lesechko.designpatterns.behavioral.visitor;

interface Developer {
    void create(ProjectClass projectClass);
    void create(DataBase dataBase);
    void create(Test test);
}
