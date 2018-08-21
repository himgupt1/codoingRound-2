package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import helper.BaseClass;

public class SignInTest extends BaseClass {

    @FindBy(linkText = "Your trips")
    private static WebElement yourTrip;

    @FindBy(id = "SignIn")
    private static WebElement signInOptn;
    
    @FindBy(id = "signInButton")
    private static WebElement signInBtn;
    
    @FindBy(id = "errors1")
    private static WebElement errorTxt;
    
    @FindBy(id = "close")
    private static WebElement closeIcon;

    public static void signIn_MissingDetailsErrors() {
    	    
    		//Initialize all elements
        	PageFactory.initElements(driver, SignInTest.class);
    
        //Go to Sign In Pop over window by navigating to Your Trips-> Sign In
        yourTrip.click();
        signInOptn.click();
       
        driver.switchTo().frame(4); //used frame is to locate sign in button
        implicitWait(10);
        
        //Tap on sign in button and Verify Error presence
        signInBtn.click();
        
        String errors1 = SignInTest.errorTxt.getText();
	    AssertJUnit.assertTrue(errors1.contains("There were errors in your submission"));
        
    }
    
}
