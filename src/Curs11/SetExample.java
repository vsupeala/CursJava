package Curs11;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> setulMeu = new HashSet<>() ;
		
		System.out.println(setulMeu.size());
		
		setulMeu.add("Rosu");
		
		boolean verificaSet = setulMeu.isEmpty();
		System.out.println(verificaSet);
		
		setulMeu.add("Galben");
		setulMeu.add("Verde");
		setulMeu.add("Negru");
		
		//setulMeu.remove("Rosu");
		
		for (String culoare: setulMeu) {
			System.out.println(culoare);
		}
		
		setulMeu.add("Alb");
		
		System.out.println("----------------------------------------------------------------------------");

		for (String culoare: setulMeu) {
			System.out.println(culoare);
		}

	}
	
	

}
