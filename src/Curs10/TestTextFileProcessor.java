package Curs10;

public class TestTextFileProcessor {

	public static void main(String[] args) {
		
		TextFileProcessor textFileProcessor = new TextFileProcessor()	;	// TODO Auto-generated method stub

		//textFileProcessor.writeFile();
		textFileProcessor.readFile();
		textFileProcessor.appendTextToFile("Cea mai noua linie");
		
		textFileProcessor.readFile();
		textFileProcessor.deleteFile();
		
	}

}
