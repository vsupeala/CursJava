package Curs6;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] textArray = new String[5];
		textArray[0] = "This ";
		textArray[1] = "is ";
		textArray[2] = "an ";
		textArray[3] = "array ";
		textArray[4] = "! ";
		
		for(String element : textArray) {
			System.out.print(element);
		}
		
		for(int i = 0; i< textArray.length; i++) {
			System.out.print(textArray[i]);

		}
		
		try {
			System.out.println(textArray[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Ai incercat sa accesezi un index in afara array-ului");
		}


	}

}
