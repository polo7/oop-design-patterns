package dev.lesechko.designpatterns.creational.abstractfactory.website;

import dev.lesechko.designpatterns.creational.abstractfactory.ProjectManagerAF;

public class WebsitePMWebsite implements ProjectManagerAF {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project.");
    }
}
