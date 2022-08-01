package Curs10;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(EnumExample.DEV.getUrl());
		
		for(EnumExample env : EnumExample.values()) {
			
			
			System.out.println(env.name() + " : " + env.getUrl());
		}

	}

}
