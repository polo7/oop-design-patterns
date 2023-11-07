package dev.lesechko.designpatterns.behavioral.template;

class WelcomePage extends WebsiteTemplate {
    // БЫЛО
//    public void showPage() {
//        System.out.println("Header");
//        System.out.println("Welcome");
//        System.out.println("Footer");
//    }
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
