package Curs5;

import java.util.Scanner;

import javax.swing.tree.AbstractLayoutCache;

public class DoWhileExample2 {
	
	/*
	 * intrebam userul un numar
	 * inmultim numarul cu 10
	 * printam rezultateul operatiei
	 * intrebam alt numar pana cand userul introduce numarul 0 si iesim din program
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Please insert a number :");
			num = scanner.nextInt();
			System.out.println("Rezultatul este " + num*10);
			
		} while (num != 0);
		
System.out.println("You exit program") ;

	}

}
