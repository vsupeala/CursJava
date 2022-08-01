package Curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arrayList = new ArrayList<>(Arrays.asList("unu", "doi", "trei", "partru", "cinci"));
		
		System.out.println(arrayList.size());
		
		arrayList.add("sase");
		
		System.out.println(arrayList.size());
		
		System.out.println("-------------------------");
		
		for(String nr: arrayList) {
			System.out.println(nr);
		}
		
		arrayList.subList(1, 4).clear();
		
		System.out.println("-------------------------");

		
		for(String nr: arrayList) {
			System.out.println(nr);
		}
		
		System.out.println("-------------------------");
		
		//contains object
		
		String element = "sase";
		if(arrayList.contains(element)) {
			System.out.println("contine elementul");
		} else {
			System.out.println("Nu contine element");
		}
		
		System.out.println("-------------------------");


		arrayList.set(0, "zero"); // update element
		
		for(String nr: arrayList) {
			System.out.println(nr);
		}
		
		System.out.println("-------------------------");

		Iterator<String> iterator = arrayList.iterator();
		 while(iterator.hasNext()) {
		System.out.println(iterator.next());
		}
		

	}

}
