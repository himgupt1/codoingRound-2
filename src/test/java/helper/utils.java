package helper;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.PlatformUtil;

public class utils {

    	    public static  WebDriver driver;
	
		public static void setDriverOS() {
			
	        if (PlatformUtil.isMac()) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver");
	        }
	        if (PlatformUtil.isWindows()) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        }
	        if (PlatformUtil.isLinux()) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
	        }
	       
	    }
		
		public static void driverInitialize() {
			
			 setDriverOS();
			 driver = new ChromeDriver();
			
		}
		
		public static void implicitWait(int timeSec) {
			
			try {
				driver.manage().timeouts().implicitlyWait(timeSec, TimeUnit.SECONDS);
			} catch(Throwable error) {
				System.out.println("TimeOut"+timeSec);
				Assert.assertTrue("Time out", false);
			}
			
		}
		
		public static void homePageNavigation( String url) {
			
			 // Go to clear trip home page
	         driver.get(url);

	    		//Maximize window
	         driver.manage().window().fullscreen();
		}
		
		 public static void quitBrowser() {
		    	
	        	driver.quit();
	    }
}
