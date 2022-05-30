package Curs5;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the first number: ");
		int num1 = scan.nextInt();
		System.out.println("Please insert the operation: ");
		char operation = scan.next().charAt(0);
		System.out.println("Please insert the second number: ");
		int num2 = scan.nextInt();
		
		int result = 0;
		
		switch(operation) {
		case '+' :
			result =num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;

		default:
			System.out.println("Wrong operation inserted!");
		}
		
		System.out.println(result);

	}

}
