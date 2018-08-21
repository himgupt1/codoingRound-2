package TestScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestPages.HotelBookingTest;

public class HotelBookingScript extends HotelBookingTest {

	//Method to search hotels
	@Test
	public void test_hotelBooking_searchHotels() {
	
		HotelBookingTest.hotelBooking_searchHotels();
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