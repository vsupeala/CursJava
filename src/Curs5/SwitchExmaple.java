package Curs5;

import java.util.Scanner;

public class SwitchExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce nota ai luat: ");
		String nota = scan.next();
		
		switch (nota) {
		
		case "A" :
			System.out.println("Felicitari!");
			break;
		case "B" :
			System.out.println("Destul de bine!");
			break;
		case "C" :
			System.out.println("Suficient!");
			break;
		case "D" :
			System.out.println("Insuficient!");
			break;
		default :
			System.out.println("Nota invalida!");	

		}

	}

}
