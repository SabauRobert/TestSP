package com.company;

public class Semigrupa extends Grupa implements Element{
    public Semigrupa(String s, String nume) {
        super(nume);
    }

    @Override
    public Element add() {
        return null;
    }

    @Override
    public void accept(Visitor printVisitor) {

    }

    public Element add(Student nume) {
        return null;
    }
}
