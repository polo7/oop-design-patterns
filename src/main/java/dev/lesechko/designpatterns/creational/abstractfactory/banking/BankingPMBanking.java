package dev.lesechko.designpatterns.creational.abstractfactory.banking;

import dev.lesechko.designpatterns.creational.abstractfactory.ProjectManagerAF;

public class BankingPMBanking implements ProjectManagerAF {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project.");
    }
}
