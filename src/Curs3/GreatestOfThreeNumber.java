package Curs3;

import java.util.Scanner;

public class GreatestOfThreeNumber {
	
	int number1;
	int number2;
	int number3;
	
	public void askTheUserForThreeNumbers() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert the first number: ");
		number1 = scanner.nextInt();
		
		System.out.println("Please insert the second number: ");
		number2 = scanner.nextInt();

		System.out.println("Please insert the third number: ");
		number3 = scanner.nextInt();
		scanner.close();
		
	}
	
	public void compareThreeNumber() {
		
		if(number1 > number2 && number1 > number3) {
			
			System.out.println("Number 1 is the greatest! ");
			
		} else if(number2 > number3 && number2 > number1) {
			
			System.out.println("Number 2 is the greatest! ");
		}
		  else if (number3 > number1 && number3 > number2) {
			System.out.println("Number 3 is the greatest! ");
		} else {
			System.out.println("Numbers are equal ");
		}

			
			
		}
	}


