package dev.lesechko.designpatterns.theory.abstractfactory;

import dev.lesechko.designpatterns.theory.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactoryAF projectTeamFactoryAF = new WebsiteTeamFactory();
        DeveloperAF developerAF = projectTeamFactoryAF.getDeveloper();
        TesterAF testerAF = projectTeamFactoryAF.getTester();
        ProjectManagerAF projectManagerAF = projectTeamFactoryAF.getProjectManager();

        System.out.println("Creating auction site...");
        developerAF.writeCode();
        testerAF.testCode();
        projectManagerAF.manageProject();
    }


}
