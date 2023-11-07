package dev.lesechko.designpatterns.behavioral.visitor;

class Project implements ProjectElement{
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[] {
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (var element : projectElements)
            element.beWritten(developer);
    }
}
