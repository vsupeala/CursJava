package Curs4;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please insert first number : ");
		int num1 = scan.nextInt();
		System.out.println("Please insert second number : ");
		int num2 = scan.nextInt();
		
		if (num1 > 0) {
			System.out.println("Num 1 is positive");
		} else {
			System.out.println("Num 1 is negative");
		}
		
		String result;
		result = num1>0 ? "Number 1 is positive" : "Number 1 is negative";
		System.out.println(result);
		result = num2>0 ? "Number 2 is positive" : "Number 2 is negative";
		System.out.println(result);
		result = (num1>0) && (num2>0) ? "Both numbers are positive " : "Not both numbers are positive";
		
		
		if (num2 > 0) {
			System.out.println("Num 2 is positive");

		} else {
			System.out.println("Num 2 is negative");

		}
		
		
		if (num1>0 && num2>0) {
			System.out.println("Both numbers are positive");
		} else {
			System.out.println("Not both numbers are positive");
		}
		
		if (num1<num2) {
			System.out.println();
		}else if (num1 == num2) {
			System.out.println();

		} else {
			System.out.println();

		}
		
		result = num1 == num2 ? "numbers are equal" : (num1<num2 ? "Number 1 is the smallest" : "Number 2 is the smallest");
		System.out.println(result);

		
	}

}
