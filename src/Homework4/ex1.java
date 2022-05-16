package Homework4;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("Please enter number " + i + ":");
			result += scanner.nextInt();			
			
		}
		
		System.out.println("The sum of the number is: "+ result);	
		

	}

}
