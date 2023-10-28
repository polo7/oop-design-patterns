package dev.lesechko.designpatterns.creational.abstractfactory.website;

import dev.lesechko.designpatterns.creational.abstractfactory.DeveloperAF;

public class PhpDeveloperWebsite implements DeveloperAF {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code");
    }
}
