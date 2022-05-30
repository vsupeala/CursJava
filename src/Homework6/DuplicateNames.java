package Homework6;

public class DuplicateNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana",
				"Bogdan", "Oana", "Ion"};
		
		for (int i = 0; i< myStringArray.length; i++) {
			for (int j = i+1; j< myStringArray.length; j++) {
				if(myStringArray[j].equals(myStringArray[i])) {
					System.out.println("Nume duplicat: " + myStringArray[j]);
				}
			}
		}

	}

}
