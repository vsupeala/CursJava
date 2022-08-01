package Curs11;

public class TestStatus {
	
	public Status status;
	
	public TestStatus(Status status) {
		this.status = status;
	}
	
	public void getStatus() {
		
		switch(status) {
		
		case PASS:
			System.out.println("Test passed");
		break;	
		case FAIL:
			System.out.println("Test failed!");
		break;
		case SKIPPED:
			System.out.println("Test skipped");
		break;
		default:
			System.out.println("Invalid status!");
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String statuString = "FAIL";
		TestStatus test1 = new TestStatus(Status.valueOf(statuString));
		
		test1.getStatus();
		

	}

}
