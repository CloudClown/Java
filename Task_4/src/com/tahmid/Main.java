/*
 * Name: Tahmid Rahman Chowdhury
 * Id: 2012020072
 * Section: B
 * Email: cse_2012020072@lus.ac.bd
 * Date: 15/10/2021
 * */

package com.tahmid;
import java.math.BigInteger;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        AdvancedArithmetic result =new MyCalculator();
        // Divisor of the n number
        System.out.print("Enter a number for divisor: ");
        int numOfDiv = input.nextInt();
        int div = result.divisorSum(numOfDiv);
        System.out.println("Divisor of "+ numOfDiv + " is " + div);

        // Factorial of n number
        System.out.print("Enter a number for factorial: ");
        int numOfFac = input.nextInt();

      if(numOfFac <= 50) {
          BigInteger facRes = result.findFactorial(numOfFac);
          System.out.println(numOfFac + " != " + facRes);
      } else {
          System.out.println("Enter a number between");
      }
    }
}
