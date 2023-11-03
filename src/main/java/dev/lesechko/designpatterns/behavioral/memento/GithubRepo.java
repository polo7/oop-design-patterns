package dev.lesechko.designpatterns.behavioral.memento;

class GithubRepo {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

}
