package Homework8;

public class Vehicul {
	
	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}

	public String nume() {
		return "Augustina";
	}
	
	public String motorizare() {
		return "1.4 rup asfaltu";
	}
	
	public void detaliiVechicul() {
		System.out.println("Nivelul de poluare pentru masina " + brand + " este " + nivelPoluare + " si viteza medie atinsa este de " + vitezaMedie + " km/h." );
	}


}
