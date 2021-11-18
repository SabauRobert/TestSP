package com.company;

public class Student extends Semigrupa implements Element{
    String nume;
    String mail;

    public Student(String nume, String mail) {
        super(nume, nume);
        var nume1 = this.nume;
        var mail1 = this.mail;
    }

    public String getNume() {
        return nume;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public Element add() {
        return null;
    }

    @Override
    public void accept(Visitor printVisitor) {

    }
}
