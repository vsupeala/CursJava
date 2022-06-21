package Curs9;

import java.util.Scanner;

public class TestVerifyAge {

	public static void main(String[] args) throws CustomAgeException {
		// TODO Auto-generated method stub
		
		AgeVerifier ageVerifier = new AgeVerifier();
		System.out.println("Please enter your age: ");
		
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		try {
		ageVerifier.checkAgeLimit(age);
		} catch (CustomAgeException e) {
			e.printStackTrace();
			System.out.println("You must be 18 to vote!");
		}
	}

}
