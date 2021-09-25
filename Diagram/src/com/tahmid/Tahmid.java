package com.tahmid;

public class Tahmid extends Laptop {
    Tahmid() {
        name = "MSI";
    }

    @Override
    void aboutGadget() {
//        super.aboutGadget();
        System.out.println(name  + " Laptop");
        System.out.println(price + "$");
    }
}
