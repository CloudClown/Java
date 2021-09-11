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
        Player player = new Player("Shakib,", 75);
	Cricket cricket = new Cricket("International match,", 20, player);
	cricket.display(cricket);

	Football football = new Football();

    }
}
