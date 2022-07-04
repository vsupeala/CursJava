package Homework7;

import java.util.Scanner;

public class Qualification extends Teacher{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Teacher michaelTeacher = new Teacher();
		System.out.println("Insert your course:");
		michaelTeacher.setCourse(scan.next());
		System.out.println("Insert your years of experience(must be a number)");
		michaelTeacher.setExperienceYears(scan.nextInt());
		System.out.println("Insert your schedule:");
		michaelTeacher.setSchedule(scan.next());
		
		michaelTeacher.verifyTeacher();
		

	}

}
