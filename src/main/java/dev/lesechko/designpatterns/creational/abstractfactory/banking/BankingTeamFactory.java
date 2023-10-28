package dev.lesechko.designpatterns.creational.abstractfactory.banking;

import dev.lesechko.designpatterns.creational.abstractfactory.DeveloperAF;
import dev.lesechko.designpatterns.creational.abstractfactory.ProjectManagerAF;
import dev.lesechko.designpatterns.creational.abstractfactory.ProjectTeamFactoryAF;
import dev.lesechko.designpatterns.creational.abstractfactory.TesterAF;

public class BankingTeamFactory implements ProjectTeamFactoryAF {

    @Override
    public DeveloperAF getDeveloper() {
        return new JavaDeveloperBanking();
    }

    @Override
    public TesterAF getTester() {
        return new QATesterBanking();
    }

    @Override
    public ProjectManagerAF getProjectManager() {
        return new BankingPMBanking();
    }
}
