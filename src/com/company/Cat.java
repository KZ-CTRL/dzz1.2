package com.company;

public class Cat extends Animal implements Printable{
    private  String pol;

    public Cat(String vid, String pol) {
        super(vid);
        this.pol = pol;
    }

    public String getPol() {
        return pol;
    }


    @Override
    public void print() {
        System.out.println("Пол "+ getPol());

    }
}

