package Curs6;

public class FindIndexofElementInArray {

		// TODO Auto-generated method stub
		
		/*
		 * Avem un array
		 * Ne trebuie o metoda pentru a afla care este indexul unui element
		 * Printam care este elementul si indexul
		 * Rezolvare cu FOR si cu FOR EACH
		 * Rezolvare cu WHILE
		 */
		
		int[] numbers = {3, 5, 7, 8, 9, 2};
		
		public void findIndexUsingFor (int element) {
			
			for (int i=0; i<numbers.length; i++) {
				if (element == numbers[i]) {
					System.out.println("index pentru elementul " + element + " este :"+ i);
				}
			}
			
		}
		
		public void findIndexUsingForEach (int element) {
			int index = 0;
			for(int nr: numbers) {
				
				if (element == nr) {
					System.out.println("index pentru elementul " + element + " este :"+ index);
				}
				index ++;
			}
		}
		
		public void findIndexUsingWhile (int element) {
			
			int i = 0;
			
			while (i<numbers.length) {
				if (element == numbers[i]) {
					System.out.println("index pentru elementul " + element + " este :"+ i);

				}
				i++;
			}
			
		}
		
		public static void main(String[] args) {
			
			FindIndexofElementInArray obj = new FindIndexofElementInArray();
			obj.findIndexUsingFor(8);
			obj.findIndexUsingForEach(8);
			obj.findIndexUsingWhile(8);


	}

}
