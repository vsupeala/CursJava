package Curs9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception5 {

	public static void main(String[] args) {
		
		System.out.println(division());
		
	}
		
	public static int division() {
		Scanner scan = new Scanner(System.in);
		int output = 0;

		
		try {
		System.out.println("Please enter number 1");
		int num1 = scan.nextInt();
		System.out.println("Please enter number 2");
		int num2 = (Integer) null;
		//System.out.println(num1/num2);
		
	
			output = num1/num2;
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
		return output ;

}
}
