package Curs9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("Please enter number 1");
		int num1 = scan.nextInt();
		System.out.println("Please enter number 2");
		int num2 = scan.nextInt();
		//System.out.println(num1/num2);
		
	
			int output = num1/num2;
			System.out.println("Result :" + output);
			
		} catch(ArithmeticException numeleObiectului) {
			System.out.println("You should not divide by zero!");
			numeleObiectului.printStackTrace();
		} catch(InputMismatchException numeleObiectlui2) {
			System.out.println("Integers onlyy");
			numeleObiectlui2.printStackTrace();

		} catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		System.out.println("Code after try catch");
		
	}

}
