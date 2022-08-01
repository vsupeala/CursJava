package Curs11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import sun.tools.jar.resources.jar;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] myStringArray = {"Oana", "ion", "MAria", "ion", "Oana", "Bogdan", "Oana", "ion"};
		
		for (int i = 0; i < myStringArray.length; i++) {
			for (int j = i+1; j < myStringArray.length; j++) {
				if (myStringArray[i].equals(myStringArray[j])) {
					System.out.println("Duplicat gasit: " + myStringArray[i]);
				}
			}
		}
		
		Set<String> duplicate = findDuplicates(myStringArray);
		System.out.println("set array " + Arrays.toString(myStringArray));
		
		for (String nume: duplicate) {
			System.out.println("nume duplicat gasit : " + nume);
		}
	}
	
	public static Set<String> findDuplicates(String[] array){
		
		Set<String> duplicatesNames = new HashSet<>();
		
		for (int i = 0; i< array.length; i++) {
			for (int j = 0; j< array.length; j++) {
				if (array[i].equals(array[j])  && i!=j) {
					duplicatesNames.add(array[i]);
					break;
				}
			}

			
		}
			
		
		return duplicatesNames;
		
		
	}

}
