package dev.lesechko.designpatterns.creational.abstractfactory.website;

import dev.lesechko.designpatterns.creational.abstractfactory.DeveloperAF;
import dev.lesechko.designpatterns.creational.abstractfactory.ProjectManagerAF;
import dev.lesechko.designpatterns.creational.abstractfactory.ProjectTeamFactoryAF;
import dev.lesechko.designpatterns.creational.abstractfactory.TesterAF;

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
