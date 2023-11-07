package dev.lesechko.designpatterns.behavioral.template;

class NewsPage extends WebsiteTemplate {
    // БЫЛО
//    public void showPage() {
//        System.out.println("Header");
//        System.out.println("News");
//        System.out.println("Footer");
//    }
    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
