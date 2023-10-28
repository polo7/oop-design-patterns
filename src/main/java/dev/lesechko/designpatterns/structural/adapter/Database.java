package dev.lesechko.designpatterns.structural.adapter;

public interface Database {
    void insert();
    void update();
    void select();
    void remove();
}
