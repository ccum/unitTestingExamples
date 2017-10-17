package project.test;

public class TestRunner {
	
	public TestRunner() {
		try {
			UnitTest test= new BookTest();
			test.runTest();
			
			UnitTest test2= new LibraryTest();
			test2.runTest();
			
			System.out.println("Success!!!");
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("FAILURE!!");
			
		}
		
		System.out.println(UnitTest.getNumSuccess() + " tests completed successfully");
	}

}
