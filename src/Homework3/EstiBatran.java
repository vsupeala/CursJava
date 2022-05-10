package Homework3;

import java.util.Scanner;

public class EstiBatran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti varsta dvs. :");		
		int varsta = scan.nextInt();
		
		if (varsta < 18) {
			System.out.println("Esti minor");
		} else if (varsta < 65) {
			System.out.println("Esti adult");
		} else {
			System.out.println("Esti batran");
		}
		
	}

}
