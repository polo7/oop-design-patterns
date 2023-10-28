package dev.lesechko.designpatterns.creational.abstractfactory.website;

import dev.lesechko.designpatterns.creational.abstractfactory.TesterAF;

public class ManualTesterWebsite implements TesterAF {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website code.");
    }
}
