package Curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> myMap = new HashMap<>();
		System.out.println(myMap.size());
		
		myMap.put("T", "Tester");
		myMap.put("D", "Developer");
		myMap.put("M", "Manager");
		myMap.put("P", "ProductOwner");
		
		
		System.out.println("contains key : " + myMap.containsKey("X"));
		System.out.println("contains value: " + myMap.containsValue("Tester"));
		
		
		for (String key: myMap.keySet()) {
			System.out.println(key);
		}
		
		for (String value: myMap.values()) {
			System.out.println(value);
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println(myMap.get("P"));

	}

}
