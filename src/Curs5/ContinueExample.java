package Curs5;

import java.util.Scanner;

public class ContinueExample {
	
	/*
	 * daca userul da in total (suma celor 2 zaruri): 2, 6, 12 pierde ---> Pierde jocul ->
	 * daca userul da in total : 7, 11 -> castiga jocul
	 * daca userul da in total 3, 10 -> repeta aruncarea
	 * daca da alta varianta decat cele de mai sus il intrebam daca vrea sa mai dea inca o data
	 * raspunsul trebuie sa fie boolean cu true/false
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean condition = true;
		
		while(condition) {
			
			int dice1 = (int) (Math.random()*6+1);
			int dice2 = (int) (Math.random()*6+1);
			int total = dice1 + dice2;
			
			//case pierde
			if (total == 2 || total == 6 || total ==12) {
				System.out.println("Imi pare rau! Ai dat : " + total + " Ai pierdut!");
				break;
			}
			else if (total == 7 || total ==11) {
				System.out.println("Felicitari! Ai dat : " + total + " Ai castigat!");
				break;
			}
			
			else if (total == 3 || total ==10) {
				System.out.println("Ai dat : " + total + " Automat mai dai o data!");
				continue;
			}
			
			System.out.println("Mai dai o data?");
			Scanner scanner = new Scanner(System.in);
			condition = scanner.nextBoolean();
			
			System.out.println("Game over!");
		}

	}

}
