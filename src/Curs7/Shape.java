package Curs7;

public class Shape {
	
	String shapeName = "genericShape";
	String shapeColor = "genericColor";
	
	public Shape (String color, String name) {
		
		this.shapeColor = color;
		this.shapeName = name;
	}
	
	public void displayShapeDetails() {
		System.out.println("Shape name is : " + shapeName + " and the color is : " + shapeColor);
	}

}
