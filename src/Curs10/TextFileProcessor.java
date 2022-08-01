package Curs10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {

	/**
	 * write a new text file
	 * @param args
	 */
	
	public void writeFile() {
		
		try {
			FileWriter myFileWriter = new FileWriter("file.txt");
			myFileWriter.write("Textul meu in fisier");
			myFileWriter.close(); //sa dispara warning pe myFileWriter
			System.out.println("Successfully wrote to file!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Nu am gasit fisierul!");
			e.printStackTrace();
		}
	}
	
	/**
	 * read txt from file
	 */
	
	public void readFile() {
		
		File objFile = new File("file.txt");
		try {
			Scanner fileReader = new Scanner(objFile);
			
			while (fileReader.hasNext()) {
				String text = fileReader.nextLine();
				System.out.println(text);
			}
			fileReader.close();
		
			
		} catch (FileNotFoundException e) {
			System.out.println("N-am gasit fisierul");
			e.printStackTrace();
		}
		
	}
	
	public void appendTextToFile(String textToWrite) {
		FileWriter myWriter;
		try {
			myWriter = new FileWriter("file.txt", true);
			myWriter.write(textToWrite);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void deleteFile() {
		File myFile = new File("file.txt");
		myFile.delete();
		
		System.out.println("Delete file : " + myFile.getName());
	}

	
	
}
