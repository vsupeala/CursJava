package Curs2;

public class MethodExample {
	
	/*
	 * Calculeaza aria unor camere
	 * Calculeaza nr total de mp
	 * Poti calcula mai multe camere
	 */
	int nrTotal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Room 1
		int length = 3;
		int width = 4;
		int room1area = length * width;
		System.out.println(room1area);
		
		MethodExample sufragerie = new MethodExample();
		MethodExample bucatarie = new MethodExample();
		
		System.out.println(sufragerie.calculateArea2(4, 5));
		System.out.println(bucatarie.calculateArea2(7, 3));
		System.out.println(calculateTotal(sufragerie.calculateArea2(4, 5), bucatarie.calculateArea2(7, 3)));
		
		sufragerie.calculateArea(4,  5);
		bucatarie.calculateArea(7,  3);
		System.out.println(calculateTotal(sufragerie.nrTotal, bucatarie.nrTotal));


	}

	public void calculateArea(int length, int width) { //calculateArea > nrTotal
		nrTotal = length * width;		
	}
	
	
	public int calculateArea2(int length, int width) { //calculateArea2() > 34
		int nrTotaliMP = length * width;
		return nrTotaliMP;
	}
	
	public static int calculateTotal(int area1, int area2) {
		int result = area1 + area2 ;
		return result;
	}
}
