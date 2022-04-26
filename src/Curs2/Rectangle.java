package Curs2;

public class Rectangle {
	
	//variabile de clasa
	private int length;
	private int width;
	private String name;
	
	//noi nu l-am scris dar Java ni-l pune automat
	
	public Rectangle() {
		
	}
	
	// alt constructor, permite acelasi nume
	public Rectangle(int num1, int num2) {
		setLength(num1);
		setWidth(num2);	// width = num2; // this.width = width;
	}
	
	public Rectangle(int num1, int num2, String Name) {
		setLength(num1);
		setWidth(num2);	// width = num2; // this.width = width;
		name = Name;
	}
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void calculateTotal() {
		
	}

}
