package Curs11;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] array = new int[2];

		int [][] array = { {1, 2}, {3, 4}  };
		/*
		 *        column 0      column 1 
		 * row 0     1            2
		 * 
		 * row 1     3            4
		 */
		
//		System.out.println(array[0][1]);
//		System.out.println(array[1][1]);
		
		for(int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				System.out.print(array[i][j] + " ");
			}
		System.out.println();
		}
		
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		/*
		 * textArray--> 
		 *          col0     col1    col2
		 * row 0     alb      negru    verd
		 * 
		 * row 1     rosu     roz      orange
		 */
		String[][] textArray = new String[2][3];
		textArray[0][0] = "Alb";
		textArray[0][1] = "Negru";
		textArray[0][2] = "Verde";
		
		for (int i = 0; i < textArray.length; i++) {
			System.out.println("ROW: ");
			
			for (int j = 0; j < textArray[i].length; j++) {
				
				System.out.println("COL: " + textArray[i][j] + " ");
			}
			
		}
		
		
		//T[][] array = new T[][] ---> {  {String, int, boolean}, {String, int, boolean},  {String, int, boolean}  }
		
		
		
	}

}
