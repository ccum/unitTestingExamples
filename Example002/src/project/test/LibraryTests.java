package project.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import project.model.Library;

public class LibraryTests extends TestSuite {
	
	public static Test suite() {
		
		TestSuite suite = new TestSuite();
		suite.addTest(new TestSuite(BookTest.class));
		suite.addTest(new TestSuite(LibraryTest.class));
		return suite;
	} 
	
}
