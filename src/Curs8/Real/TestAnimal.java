package Curs8.Real;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
//		animal.makeSound();
		
		System.out.println("------------------------------");
		
//		Deer bambiDeer = new Deer();
//		bambiDeer.makeSound();
//		bambiDeer.eatGrass();
		
		System.out.println("------------------------------");

//		Lion simba = new Lion();
//		simba.makeSound();
//		simba.eatMeat();
		
		System.out.println("------------------------------");


		Animal simba = new Lion();
		simba.makeSound();
//		simba.eatMeat(); nu merge
		((Lion) simba).eatMeat(); ///CAST
		feedAnimal(simba);
		
		simba = new Deer();
		simba.makeSound();
//		simba.eatGrass(); tot nu va merge
		feedAnimal(simba);
	
	}
	
	public static void feedAnimal(Animal obiect) {
		if (obiect instanceof Lion) {
			System.out.println("You are getting burgers!");
		} else if (obiect instanceof Deer) {
			System.out.println("Ypu are getting salad!");
		}
	}

}
