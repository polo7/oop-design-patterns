package dev.lesechko.designpatterns.structural.proxy;

class ProjectRunner {
    public static void main(String[] args) {
//        Project project = new RealProject("https://github.com/lesechko/realProject");
        Project project = new ProxyProject("https://github.com/lesechko/realProject");
        project.run();
    }
}
