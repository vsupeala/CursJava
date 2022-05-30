package Curs6;

import java.util.Random;


public class ArrayExample3 {
	
	
	/*
	 * Facem un program care genereaza 6 numere intre  0 si 9
	 * le tine intr-un array
	 * nu tine numere duplicate
	 * printeaza array-ul
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayExample3 ex = new ArrayExample3();
			ex.printArray(ex.generateNumbers());
	}
	
		public final int LENGTH = 6; //conventie pentru variabile care raman constante => de obicei pune si final
		public final int MAX_NUMBERS = 9;
		
		public int[] generateNumbers() {
			int[] numbers = new int[LENGTH];
			
			Random random = new Random();
			
			for (int i=0; i<LENGTH; i++) {
				int randomNumber = 0;
				
				do {
					randomNumber = random.nextInt(MAX_NUMBERS);
					
				}while(checkForUniqueness(numbers, randomNumber));
				numbers[i] = randomNumber;
			}
			
			return numbers;
			
		}
		
		public void printArray(int[] array) {
			for (int nr: array) {
				System.out.print(nr + " | ");
			}
		}
		
		public boolean checkForUniqueness(int[] array, int element) {
			
			for (int number: array) {
				if(number == element) {
					return true;
				}
			}
			
			return false;
		}
		

	

}
