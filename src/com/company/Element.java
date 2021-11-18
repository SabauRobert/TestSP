package com.company;

public interface Element {
    //void print();
    //String add();
    Element add();

    //Element add(An nume);

    void accept(Visitor printVisitor);
}
