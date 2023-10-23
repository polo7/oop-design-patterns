package dev.lesechko.designpatterns.theory.abstractfactory;

import dev.lesechko.designpatterns.theory.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactoryAF projectTeamFactoryAF = new BankingTeamFactory();
        DeveloperAF developerAF = projectTeamFactoryAF.getDeveloper();
        TesterAF testerAF = projectTeamFactoryAF.getTester();
        ProjectManagerAF projectManagerAF = projectTeamFactoryAF.getProjectManager();

        System.out.println("Creating bank system...");
        developerAF.writeCode();
        testerAF.testCode();
        projectManagerAF.manageProject();
    }
}
