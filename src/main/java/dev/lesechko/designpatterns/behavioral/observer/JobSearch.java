package dev.lesechko.designpatterns.behavioral.observer;

class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer firstSibscriber = new Subscriber("Eugene S.");
        Observer secondSibscriber = new Subscriber("Igor S.");

        jobSite.addObserver(firstSibscriber);
        jobSite.addObserver(secondSibscriber);

        jobSite.addVacancy("Third Java position");
        jobSite.removeVacancy("First Java position");
    }
}
