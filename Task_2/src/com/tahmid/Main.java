/*
 * Name: Tahmid Rahman Chowdhury
 * Id: 2012020072
 * Section: B
 * Email: cse_2012020072@lus.ac.bd
 * Date: 14/7/2021
 * */

package com.tahmid;

public class Main {

    public static void main(String[] args) {
        Student studentDefault = new Student();
        Student studentSingleParaConstructor = new Student(72);
        Student studentDoubleParaConstructor = new Student(72, "Tahmid");

        studentDefault.display();
    }
}
