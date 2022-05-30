package Curs4;

import java.util.Scanner;


public class ForWhileExample {
	
	/*
	 * cerem numere
	 * inmultim cu 10 fiecare numar
	 * cand introduce 0 iesim din program
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rezolvareCuWhile();

	}
	
	public static void rezolvareCuFor() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert a number :");
		
		//int val = 0;
		
		for (int i = scan.nextInt(); i!=0; i=scan.nextInt()) {
			i *= 10;
			System.out.println("Please enter a number: ");
			System.out.println(i);
		}
		
		
	}
	
	public static void rezolvareCuWhile() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert a number :");
		
		int i = scan.nextInt();
		while (i!=0) {
			
			i*=10;
			System.out.println("Please enter a number: ");
			System.out.println(i);
			i = scan.nextInt();
		}
	}

}
