package TestScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestPages.SignInTest;

public class SignInScript extends SignInTest {

	//Method to test sign in error when no details are entered
	@Test
	public void test_signIn_MissingDetailsErrors() {
		
		//Call Sign In function from SignInTest Page 
		SignInTest.signIn_MissingDetailsErrors();
	}
	
	@BeforeClass
	 public void start_test () {
		
		// Initialize driver and Go to home page
       init();
	 }
	
	@AfterClass
	 public void finish_test () {
		
		//Quit the browser
		driver.quit();
	 }
	
}
