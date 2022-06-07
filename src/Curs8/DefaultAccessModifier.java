package Curs8;

class DefaultAccessModifier {
	
	/*
	 * Daca nu mentionam niciun access modifier, se considera default
	 * 
	 * Scopul lui este limitat la pachetul in care se afla
	 * 
	 * Same class: yes
	 * Subclass in acelasi pachet : yes
	 * Alta clasa in acelasi pachet : yes
	 * 
	 * Subclass in alt pachet : no
	 * Alta clasa in alt pachet : no
	 */
	
	String mesaj; //se considera default
	
	void printMesaj() {
		System.out.println("Default modifier!");
	}

}
