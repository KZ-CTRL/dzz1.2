package com.company;

public class Animal {
    private String vid;

    public String getVid() {
        return vid;
    }

    public Animal(String vid) {
        this.vid = vid;
    }
    public String PrintInfo(){
        return "Вид "+ getVid();
    }
}
