package Homework6;

import java.util.Scanner;

public class VowelsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		int aux =0;

		System.out.println("Insert: ");
		Scanner scanner = new Scanner(System.in);
		String yourText = scanner.nextLine().toLowerCase();
		
		
		for (int i = 0; i < yourText.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if(yourText.charAt(i) == vowels[j]) {
					aux++;
				}
			}

		}

		System.out.println("Vocale: " + aux + " de vocale din text");
	}

}

