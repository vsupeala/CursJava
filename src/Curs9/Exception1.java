/**
 * 
 */
package Curs9;

/**
 * @author ssupeala
 *
 */
public class Exception1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String[] week = {"L", "M", "Mi", "J", "V", "S", "D"};
		
		for (String day: week) {
			
			Thread.sleep(2000);
			System.out.println(day);
		}

	}

}
