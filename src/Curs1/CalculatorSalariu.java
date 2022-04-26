package Curs1;


public class CalculatorSalariu {
	
	int nrLucrate = 40; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tester tester1 = new Tester();
		
		tester1.setNume("Oana");
		tester1.setRatePerHour(25);
		tester1.setAge(52);

		
		Tester tester2 = new Tester();
		
		tester2.setNume("Ion");
		tester2.setRatePerHour(20);
		tester2.setAge(22);
		
		CalculatorSalariu calc = new CalculatorSalariu();
		System.out.println(calc.calculeazaSalariul(tester1.getRatePerHour()));
		System.out.println(tester1.getNume() + " are " + tester1.getAge() + " ani!");
		System.out.println(tester2.getNume() + " are " + tester2.getAge() + " ani!");
	
		
	}
	
	public int calculeazaSalariul(int rateHour) {
		int salariu = nrLucrate * rateHour;
		return salariu;
	}

}
