package Homework5;

import java.util.Scanner;

public class SimulareLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String correctUser = "TestUser";
		String receivedUser;
		int correctPassword = 1234;
		int receivedPassword;
		int counter = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Insert user name: ");
			receivedUser = scan.next();
			System.out.println("Insert password: ");
			receivedPassword = scan.nextInt();
			
			if (receivedUser.equals(correctUser) && receivedPassword == correctPassword) {
				System.out.println("Login Successful!");
				break;
			}
			else {
				System.out.println("Login Error!");
				counter++;
			}
			
			
		} while (counter < 3);
		
		if (counter >= 3) {
		System.out.println("Maximum attempts reached. User blocked!");
		}
		
		
		

	}

}
