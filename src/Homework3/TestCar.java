package Homework3;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 =new Car("Nissan", "R34");
		System.out.println(car1.carDetails());
		
		Car car2 =new Car("Mitsubishi", "EVO");
		System.out.println(car2.carDetails());
		
		Car.type = "Sedan";
		
		System.out.println(car1.carDetails());
		System.out.println(car2.carDetails());


	}

}
