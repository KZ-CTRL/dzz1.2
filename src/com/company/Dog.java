package com.company;

public class Dog extends  Animal implements  Printable{

    private String name;

    public Dog(String vid, String name) {
        super(vid);
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public void print() {
        System.out.println("Имя "+getName());

    }
}
