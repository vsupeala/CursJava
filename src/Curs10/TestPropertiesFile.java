package Curs10;

import java.io.IOException;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PropertiesFilesProcessor myPropFile = new PropertiesFilesProcessor();
		//myPropFile.writePropertiesFile();
		
		myPropFile.readPorpertiesFiles("pass");

	}

}
