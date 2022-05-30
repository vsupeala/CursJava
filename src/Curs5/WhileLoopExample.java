package Curs5;

import java.util.Scanner;

public class WhileLoopExample {

	/*
	 * Program care calculeaza salariul pe 1 saptamana
	 * Intrebam user cate ore a lucrat
	 * Calculam daca a lucrat maxim 40 ore / sapt si minim 1 ora pe saptamana
	 * Daca introduce un nr invalid, il rugam sa introduca din nou
	 * rate per hour este 15 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNumberHoursWorked = 40;
		int ratePerHour = 15;
		
		System.out.println("Cate ore ai lucrat saptamana aceasta ?");
		Scanner scanner = new Scanner(System.in);
		int hoursWorked = scanner.nextInt();
		
		while (hoursWorked < 1 || hoursWorked > maxNumberHoursWorked) {
			System.out.println("Numarul este invalid! Incercati din nou ");
			hoursWorked = scanner.nextInt();
		}
		
		System.out.println("Salariul este: " + ratePerHour*hoursWorked);
		

	}

}
