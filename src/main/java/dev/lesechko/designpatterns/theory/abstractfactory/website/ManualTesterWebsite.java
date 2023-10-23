package dev.lesechko.designpatterns.theory.abstractfactory.website;

import dev.lesechko.designpatterns.theory.abstractfactory.TesterAF;

public class ManualTesterWebsite implements TesterAF {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website code.");
    }
}
