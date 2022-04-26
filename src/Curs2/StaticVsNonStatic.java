package Curs2;

public class StaticVsNonStatic {
	
	public static String nume;
	
	public String prenume;
	
	public static String departament = "QA";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hello " + nume);

		//System.out.println(departament);
		//System.out.println(nume);
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		System.out.println(obj.prenume);
		
		StaticVsNonStatic person = new StaticVsNonStatic();
		person.nume = "Oana";
		System.out.println("Person " + person.nume + " " + departament );
		
		StaticVsNonStatic person1 = new StaticVsNonStatic();
		person1.nume = "Ion";
		System.out.println("Person1 " + person1.nume + " " + departament );
		System.out.println("Person " + person.nume + " " + departament );

		StaticVsNonStatic person2 = new StaticVsNonStatic();
		person2.nume = "Gigi";
		departament = "HR";
		
		System.out.println("------------------------------------------");
		System.out.println("Person " + person.nume + " " + departament );
		System.out.println("Person 1 " + person1.nume + " " + departament );
		System.out.println("Person 2 " + person2.nume + " " + departament );


	}
	
	public void printeazaNume() {
		System.out.println("Hello " + nume);
	}

}
