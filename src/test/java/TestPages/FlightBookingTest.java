package TestPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helper.BaseClass;

public class FlightBookingTest extends BaseClass {


    @FindBy(id = "OneWay")
    private static WebElement oneWay;

    @FindBy(id = "FromTag")
    private static WebElement fromTag;

    @FindBy(id = "ToTag")
    private static WebElement toTag;

    @FindBy(id = "DepartDate")
    private static WebElement departDate;
    
    @FindBy(xpath = ".//body/ul/li/a")
    private static WebElement selectDepartureValue;
    
    @FindBy(xpath = ".//body/ul[2]/li/a")
    private static WebElement selectTerminalValue;
    
    @FindBy(id = "SearchBtn")
    private static WebElement searchBtn;
    
    @FindBy(linkText = "List")
    private static WebElement listBtn;

    public static void flight_oneWayJourneyResults() {
   
      	//Initialize all elements
		PageFactory.initElements(driver, FlightBookingTest.class);
		
        oneWay.click();

        fromTag.clear();
        fromTag.sendKeys("Bangalore");

        //wait for the auto complete options to appear for the origin

        implicitWait(6);
        selectDepartureValue.click();
   
        toTag.clear();
        toTag.sendKeys("New Delhi");

        //wait for the auto complete options to appear for the destination
        implicitWait(10);
        selectTerminalValue.click();

        departDate.click();
        departDate.sendKeys(Keys.RETURN);

        //all fields filled in. Now click on search
        searchBtn.click();

        implicitWait(5);
        //verify that result appears for the provided journey search
        Assert.assertEquals(true, listBtn.isDisplayed());
   
    }
}
