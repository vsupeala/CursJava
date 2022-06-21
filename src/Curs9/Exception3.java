package Curs9;

import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String nume = "unu";
		String nume = "null";

		int[] array = {1, 2, 3, 4};
		
		try {
			//System.out.println(nume.length());
			System.out.println(nume);

			try {
				int x = 2;
				System.out.println("Printez array de x" + array[x]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Index out of bound was used!");
			}
			
		} catch(NullPointerException e) {
			System.out.println("Null pointer has occured!");
			
		}
		
		System.out.println("Code outside try catch!");

	}

}
