package Curs7;

import java.util.Scanner;

public class PasswordValidator {

	// TODO Auto-generated method stub
	/*
	 * Facem un program care valideaza o parola pe baza unor reguli
	 * Reguli:
	 * 1. Parola trebuie sa contina 10 caractere
	 * 2. Parola trebuie sa contina o litera upper case
	 * 3. Parola nu trebuie sa fie la fel ca username
	 * 
	 * Intrebam utilizatorul un username si parola
	 * Dupa validam parola si informam utilizatorul ce nu a respectat din regulile de mai sus
	 * Daca parola este valida: Parola propusa este valida!
	 */
	
	String username;
	String password;
	boolean valid;
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		PasswordValidator validator = new PasswordValidator();
		validator.printPasswordRules();
		
		do {
			validator.checkPasswordRules(validator.getProposedPassword(), validator.getProposedUsername());
			
		} while (!validator.isValid());
		
		System.out.println("Parola propusa este valida!");
		

	}
	
	public void printPasswordRules() {
		
		System.out.println("Reguli parola:");
		System.out.println("Parola trebuie sa contina minim 10 caractere");

		System.out.println("Parola trebuie sa contina o litera Upper");

		System.out.println("Parola nu trebuie sa fie la fel ca username");

	}
	
	public String getProposedPassword() {
		System.out.println("Introdu parola :");
		return scanner.nextLine();
	}
	
	public String getProposedUsername() {
		System.out.println("Introdu username :");
		return scanner.nextLine();
	}
	
	public boolean isValid() {
		
		
		return valid;
	}
	
	public void checkPasswordRules(String password, String username) {
		valid = true;
		
		if (password.length() < 10) {
			System.out.println("Parola trebuie sa contina minim 10 caractere");
			valid = false;
		}
		
		if (password.equals(password.toLowerCase())) {
			System.out.println("Parola trebuie sa contina o litera Upper");
			valid = false;

		}
		
		if (password.equalsIgnoreCase(username)) {
			
			System.out.println("Parola nu trebuie sa fie la fel ca username");
			valid = false;
		}
		
		//return valid;
		
	}
	

}
