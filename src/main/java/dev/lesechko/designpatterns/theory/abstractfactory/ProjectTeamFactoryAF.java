package dev.lesechko.designpatterns.theory.abstractfactory;

public interface ProjectTeamFactoryAF {
    DeveloperAF getDeveloper();
    TesterAF getTester();
    ProjectManagerAF getProjectManager();
}
