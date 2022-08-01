package Curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TesterArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tester t1 = new Tester("Oana", 25, "QA");
		Tester t2 = new Tester("Ion", 25, "QA");

		
		java.util.List<Tester> testerList = new ArrayList<>();
		
		testerList.add(t1);
		testerList.add(t2);

		
		System.out.println(testerList.get(0).nume);
		
		for (Tester t: testerList) {
			System.out.println(t.nume + " | " + t.age + " | " + t.departament);
		}
		
		System.out.println("----------------------------------------------------------------------------");
		
		Iterator<Tester> it = testerList.iterator();
		while(it.hasNext()) {
			Tester test = it.next();
			System.out.println(test.nume + " | "+ test.age + " | " + test.departament);
			
			
		}

	}

}
