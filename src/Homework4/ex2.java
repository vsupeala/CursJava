package Homework4;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number ");
		int number = scanner.nextInt();
		
		for (int i=1; i<=10; i++) {
			System.out.println(number + " * " + i + " = " + number*i);
		}
		

	}

}
