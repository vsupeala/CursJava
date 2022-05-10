package Curs4;

import java.util.Scanner;

public class LetterSearch {
	
	/*
	 * Intrebam utilizatorul un text si in el cautam o anumita litera
	 * Daca o gasim printam am gasit litera si numarul de cate ori am gasit litera
	 * Daca nu o gasim printam nu am gasit litera
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		char letter = 'A';
		int counter = 0;
		
		for(int i = 0; i < text.length(); i++) {
			
			char currentLetter = text.charAt(i);
			//System.out.println("Current Letter " + currentLetter);
			
			if (currentLetter == letter) {
				counter++;
			}
		}

		String result = counter > 0 ? "Letter " + letter + " appeared " + counter + " times." : "The letter " +letter+" was not found.";
		System.out.println(result);
	}

}
