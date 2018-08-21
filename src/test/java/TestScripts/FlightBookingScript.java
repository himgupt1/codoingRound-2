package TestScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestPages.FlightBookingTest;

public class FlightBookingScript extends FlightBookingTest {

	//Method to see user navigates to results page for one way journey
	@Test
	public void test_flight_oneWayJourneyResults() {

		FlightBookingTest.flight_oneWayJourneyResults();
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
