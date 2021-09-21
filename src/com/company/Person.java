package com.company;

public class Person {

    private String navn;
    private int alder;

    //konstruktør
    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public String toString() {
        return "Person{" +
                "name='" + navn + '\'' +
                ", age='" + alder +
                '}';

    }

    public void hasBirthday() {
        alder = alder + 1;
    }
}
