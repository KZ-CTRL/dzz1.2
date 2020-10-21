package com.company;

public class Cow extends Animal implements Printable{
    private  int yearJizn;

    public int getYearJizn() {
        return yearJizn;
    }

    public Cow(String vid, int yearJizn) {
        super(vid);
        this.yearJizn = yearJizn;

    }

    @Override
    public void print() {
        System.out.println("Срок жизни "+ getYearJizn());

    }
}
