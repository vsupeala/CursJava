package Homework5;

public class numereFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 0;
		int secondNumber = 1;
		int howMany = 9;
		
		System.out.print(firstNumber + " ");
		System.out.print(secondNumber + " ");

		
		for (int i = 0; i < howMany-2; i++) {
			int aux = secondNumber + firstNumber;
			firstNumber = secondNumber;
			secondNumber = aux;
			System.out.print(secondNumber + " ");
		}
		
		System.out.println(" ");
		
		int counter = 0;
		firstNumber = 0;
		secondNumber = 1;
		System.out.print(firstNumber + " ");
		System.out.print(secondNumber + " ");		
		
		while (counter < howMany-2) {
			int aux = secondNumber + firstNumber;
			firstNumber = secondNumber;
			secondNumber = aux;
			System.out.print(secondNumber + " ");
			counter++;
		}
						
		

	}

}
