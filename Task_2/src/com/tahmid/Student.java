/*
 * Name: Tahmid Rahman Chowdhury
 * Id: 2012020072
 * Section: B
 * Email: cse_2012020072@lus.ac.bd
 * Date: 14/7/2021
 */

package com.tahmid;

public class Student {
    String name;
    int id;

    static String universityName = "Leading University";

    Student() {
        // Default constructor
    }

    Student(int id) {
        this.id = id;
    }

    Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println(Student.universityName);
    }
}
