package dev.lesechko.designpatterns.theory.abstractfactory.banking;

import dev.lesechko.designpatterns.theory.abstractfactory.DeveloperAF;

public class JavaDeveloperBanking implements DeveloperAF {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code.");
    }
}
