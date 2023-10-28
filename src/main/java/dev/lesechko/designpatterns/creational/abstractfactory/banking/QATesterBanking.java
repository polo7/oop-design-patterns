package dev.lesechko.designpatterns.creational.abstractfactory.banking;

import dev.lesechko.designpatterns.creational.abstractfactory.TesterAF;

public class QATesterBanking implements TesterAF {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking code.");
    }
}
