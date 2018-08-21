package helper;

public class BaseClass extends utils {

	public static void init() {
		
		driverInitialize();
		implicitWait(5);
		homePageNavigation("https://www.cleartrip.com/");
	}
	
	public static void quitBrowser() {
		
		quitBrowser();
	}
}
