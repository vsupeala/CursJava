package Curs8;

public class ProtectedAccessModifier {
	
	/*
	 * Scopul lui este in acelasi pachet si subclase din pachete diferite
	 * Clasele nu pot fi "protected"
	 * 
	 * Same class : yes
	 * Subclass in acelasi pachet: yes
	 * Alta clasa in acelasi pachet: yes
	 * Subclasa in alt pachet: yes
	 * Alta clasa in alt pachet : no
	 * 
	 */
	
	protected String mesaj = " Protected access modifider ";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}

}
