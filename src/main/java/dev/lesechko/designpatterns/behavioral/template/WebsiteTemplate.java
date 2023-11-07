package dev.lesechko.designpatterns.behavioral.template;

abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }
    public abstract void showPageContent();
}
