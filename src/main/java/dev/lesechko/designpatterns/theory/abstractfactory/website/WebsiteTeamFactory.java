package dev.lesechko.designpatterns.theory.abstractfactory.website;

import dev.lesechko.designpatterns.theory.abstractfactory.DeveloperAF;
import dev.lesechko.designpatterns.theory.abstractfactory.ProjectManagerAF;
import dev.lesechko.designpatterns.theory.abstractfactory.ProjectTeamFactoryAF;
import dev.lesechko.designpatterns.theory.abstractfactory.TesterAF;

public class WebsiteTeamFactory implements ProjectTeamFactoryAF {
    @Override
    public DeveloperAF getDeveloper() {
        return new PhpDeveloperWebsite();
    }

    @Override
    public TesterAF getTester() {
        return new ManualTesterWebsite();
    }

    @Override
    public ProjectManagerAF getProjectManager() {
        return new WebsitePMWebsite();
    }
}
