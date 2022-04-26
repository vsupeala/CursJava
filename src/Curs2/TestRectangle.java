package Curs2;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle room = new Rectangle();
		//1. Declararea unei variabile de refetinta
		//Rectangle room
		//2. Crearea obiectului
		// new Rectangle()
		//3. Legarea variabilei de obiectul creat
		// =
		
		room.setLength(5);
		room.setWidth(5);
		
		Rectangle room1 = new Rectangle();
		room1.setLength(5);
		room1.setWidth(5);
		
		Rectangle room2 = new Rectangle(3, 4);
		Rectangle room3 = new Rectangle(3, 4, "Baie");

	}

}
