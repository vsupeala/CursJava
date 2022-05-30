package Curs6;

public class ReturnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnExample objExample = new ReturnExample();
		objExample.calculateNr(3, 20);
		System.out.println(objExample.calculateNr2(4, 20));

	}
	
	public void calculateNr(int num1, int num2) {
		
		System.out.println(num1 + num2);
		
	}
	
	public int calculateNr2(int num1, int num2) {
		
		return num1 + num2; 
	}

}
