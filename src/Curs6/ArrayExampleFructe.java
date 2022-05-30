package Curs6;

public class ArrayExampleFructe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fructe obj = new Fructe("mar", 150);
		
		Fructe[] fructe = new Fructe [4];
		
		fructe[0] = new Fructe("Banana", 256);
		fructe[1] = new Fructe("Cireasa", 15);
		fructe[2] = new Fructe("Para", 180);
		fructe[3] = obj;
		
		
		for (Fructe fruct : fructe) {
			fruct.printDetails();
		}
	}

}
