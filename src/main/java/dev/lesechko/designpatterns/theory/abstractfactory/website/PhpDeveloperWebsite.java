package dev.lesechko.designpatterns.theory.abstractfactory.website;

import dev.lesechko.designpatterns.theory.abstractfactory.DeveloperAF;

public class PhpDeveloperWebsite implements DeveloperAF {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code");
    }
}
