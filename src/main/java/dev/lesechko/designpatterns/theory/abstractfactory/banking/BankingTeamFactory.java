package dev.lesechko.designpatterns.theory.abstractfactory.banking;

import dev.lesechko.designpatterns.theory.abstractfactory.DeveloperAF;
import dev.lesechko.designpatterns.theory.abstractfactory.ProjectManagerAF;
import dev.lesechko.designpatterns.theory.abstractfactory.ProjectTeamFactoryAF;
import dev.lesechko.designpatterns.theory.abstractfactory.TesterAF;

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
