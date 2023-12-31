package dev.lesechko.designpatterns.behavioral.interpreter;

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data))
            return true;
        else
            return false;
    }
}
