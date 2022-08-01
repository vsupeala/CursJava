package Curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		
		list.add("ana");
		list.add("ion");
		list.add("maria");
		list.add("gheorghe");
		
		System.out.println(list.size());

		list.add(3, "bogdan"); // te lasa sa inserezi la ce index vrei, daca se afla in size-ul actual al lister. iti permuta don't worry
		
		
		System.out.println(list.size());
		
		for (String nume: list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}


		

	}

}
