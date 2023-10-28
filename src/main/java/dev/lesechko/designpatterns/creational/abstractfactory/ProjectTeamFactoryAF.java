package dev.lesechko.designpatterns.creational.abstractfactory;

public interface ProjectTeamFactoryAF {
    DeveloperAF getDeveloper();
    TesterAF getTester();
    ProjectManagerAF getProjectManager();
}
