package dev.lesechko.designpatterns.behavioral.template;

class WebsiteRunner {
    public static void main(String[] args) {
        // БЫЛО
//        WelcomePage welcomePage = new WelcomePage();
//        NewsPage newsPage = new NewsPage();
//
//        welcomePage.showPage();
//        System.out.println("----");
//        newsPage.showPage();
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();
        welcomePage.showPage();
        System.out.println("----");
        newsPage.showPage();
    }
}
