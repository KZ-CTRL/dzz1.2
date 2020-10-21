package com.company;

public class Main {

    public static void main(String[] args) {
        CreedObject("1").print();
        CreedObject("2").print();
        CreedObject("3").print();


    }
    public  static  Printable CreedObject(String className){
        Printable print = null;
        switch (className){
            case "1":
                print = new Dog("Питбуль", "Рон");
                break;
            case  "2":
                print = new Cat("Арабский ", "жен");
                break;
            case "3":
                print = new Cow("Черная",3);
                break;


        } return print;
    }
}
