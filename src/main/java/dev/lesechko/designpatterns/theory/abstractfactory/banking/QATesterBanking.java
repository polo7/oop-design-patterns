package dev.lesechko.designpatterns.theory.abstractfactory.banking;

import dev.lesechko.designpatterns.theory.abstractfactory.TesterAF;

public class QATesterBanking implements TesterAF {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking code.");
    }
}
