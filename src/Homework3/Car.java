package Homework3;

public class Car {
	
	public static String brand;
	public static String type;
	public static String engine;
	
	
	public Car(String brand, String engine) {
		Car.brand = brand;
		Car.engine = engine;
		Car.type = "SUV";
	}
	
	public static String carDetails() {
		return "All " + Car.brand + " cars are " + Car.engine + " and are of type " + Car.type;
	}
	
	

}
