package Curs8.Real;

public class OverloadExample {
	
	public static void main(String[] argStrings ) {
		
		System.out.println(multiply(2,3));
		System.out.println(multiply(2.33,3.667));

	
		
	}
	
	public static int multiply(int a , int b) {
		return a*b;
	}
	
	public static double multiply(double a, double b) {
		return a*b;
	}

}
