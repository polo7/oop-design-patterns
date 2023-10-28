package dev.lesechko.designpatterns.creational.abstractfactory.banking;

import dev.lesechko.designpatterns.creational.abstractfactory.DeveloperAF;

public class JavaDeveloperBanking implements DeveloperAF {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code.");
    }
}
