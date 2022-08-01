package Curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "Negru");
		map.put(101, "Galben");
		map.put(23, "Alb");
		
		System.out.println(map);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(33, "Rosu");
		map2.put(16, "MAro");
		map2.put(267, "Albastru");
		
		System.out.println(map2);
		
		map.putAll(map2);
		System.out.println("Updated map" + map);

		

	}

}
