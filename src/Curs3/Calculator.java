package Curs3;

import java.util.Scanner;

public class Calculator {
	
	/*
	 * Calculator pentru operatiile de baza: +, -, *, / cu 2 numere
	 * Intrebam userul primul numar
	 * Intrebam operatia pe care vrea sa o execute
	 * Intrebam al doilea numar
	 * Printam numerele, operatia si rezultatul. Exemplu: 2 + 3 = 5
	 */
	int num1;
	int num2;
	char operation;
	int result;
	
	public void askTheUser() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please insert the first number: ");
		num1 = scanner.nextInt();
		System.out.println("Please enter the operation: ");
		operation = scanner.next().charAt(0);
		System.out.println("Please insert the second number: ");
		num2 = scanner.nextInt();
		scanner.close();
		
	}
	
	public void calculateValues () {
		
		if (operation == '+') {
			result = num1 + num2;
			printResult();
		} else if (operation == '-') {
				result = num1 - num2;
				printResult();
		} else if (operation == '*' || operation == 'x') {
			result = num1 * num2;
			printResult();
			
		} else if (operation == '/') {
			result = num1 / num2;
			printResult();
			
		} else {
			System.out.println("No valid operation introduced. ");

		}
	}
	
	public void printResult() {
		System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
	}
	
	

}
