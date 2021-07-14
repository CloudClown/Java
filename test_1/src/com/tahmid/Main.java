/*
* Name: Tahmid Rahman Chowdhury
* Id: 2012020072
* Section: B
* Email: cse_2012020072@lus.ac.bd
* Date: 14/7/2021
* */

package com.tahmid;
import  java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Section: ");
        String section;
        section = input.nextLine();

        Info info = new Info();
        Hoby hoby = new Hoby();

        System.out.println(section);
        System.out.println(info.name);
        System.out.println(info.id);
        System.out.println(hoby.hobbyName);

    }
}
