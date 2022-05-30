package Homework6;

import java.util.Scanner;

public class SumOfTenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_NUMBER = 10;
		int sum = 0;
		int[] numerele = new int[MAX_NUMBER];
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu 10 numere: ");
		
		for(int i = 0; i < MAX_NUMBER; i++) {
			numerele[i] = scan.nextInt();
		}
		
		for(int i = 0; i < MAX_NUMBER; i++) {
			sum = sum + numerele[i];
		}
		
		System.out.println("Suma numerelor din array este: " + sum);
		

	}

}
