package dev.lesechko.designpatterns.theory.abstractfactory.banking;

import dev.lesechko.designpatterns.theory.abstractfactory.ProjectManagerAF;

public class BankingPMBanking implements ProjectManagerAF {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project.");
    }
}
