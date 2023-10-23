package dev.lesechko.designpatterns.theory.abstractfactory.website;

import dev.lesechko.designpatterns.theory.abstractfactory.ProjectManagerAF;

public class WebsitePMWebsite implements ProjectManagerAF {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project.");
    }
}
