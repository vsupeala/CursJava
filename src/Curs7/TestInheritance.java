package Curs7;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TesterAutomat tester = new TesterAutomat();
		
		tester.setProgrammingLanguage("Java");
		tester.setDepartment("Quality Assurance");
		tester.setSeniority("Junior");
		tester.setEmail("matei@matei.com");
		tester.setName("Matei");
		
		System.out.println("Numele angajatului este " + tester.getName() + " face parte din departamentul " + tester.getDepartment() + " este de nivel senioritate: "
			+ tester.getSeniority() + " si foloseste " + tester.getProgrammingLanguage() + " pentru a scrie teste");
		
	}

}
