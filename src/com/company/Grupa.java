package com.company;

public class Grupa extends An implements Element{
    public Grupa(String nume) {
        super(nume);
    }

    @Override
    public Element add() {
        return null;
    }

    @Override
    public void accept(Visitor printVisitor) {

    }
}
