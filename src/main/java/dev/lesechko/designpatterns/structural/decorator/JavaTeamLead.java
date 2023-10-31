package dev.lesechko.designpatterns.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return " Send week report to the customer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }

}
