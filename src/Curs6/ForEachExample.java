package Curs6;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cities = {"Iasi", "Arad", "Cluj", "Alba"};
		
		for(int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		for (String oras: cities) {
			System.out.println(oras);
		}

	}

}
