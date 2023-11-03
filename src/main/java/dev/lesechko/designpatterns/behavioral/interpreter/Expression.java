package dev.lesechko.designpatterns.behavioral.interpreter;

interface Expression {
    boolean interpret(String context);
}
