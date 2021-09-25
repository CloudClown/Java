package com.tahmid;

public class Gadget {
    String name;
    int price;

//    Gadget(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }

    Gadget() {
        name = null;
        price = 0;
    }

    void aboutGadget(){
        System.out.println("Welcome to the gadget world");
    }
}
