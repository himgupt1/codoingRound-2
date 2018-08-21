package TestPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import helper.BaseClass;

public class HotelBookingTest extends BaseClass{

    @FindBy(linkText = "Hotels")
    private static WebElement hotelLink;

    @FindBy(id = "Tags")
    private static WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private static WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private static WebElement travellerSelection;
    
    @FindBy(xpath = ".//body/ul/li[2]/a")
    private static WebElement selectHotelName;
    
    @FindBy(id = "SearchHotelsButton")
    private static WebElement searchBtn;
    
    @FindBy(id = "CheckInDate")
    private static WebElement checkINDate;
    
    @FindBy(id = "CheckOutDate")
    private static WebElement checkOutDate;
    
    @FindBy(linkText = "List")
    private static WebElement listBtn;
    
    public static void hotelBooking_searchHotels() {
    	
        //Initialize all elements
        PageFactory.initElements(driver, HotelBookingTest.class);
  
        //Go to Hotels tab and select hotel location
        hotelLink.click();
        localityTextBox.clear();
        localityTextBox.sendKeys("Indiranagar, Bangalore");
        implicitWait(3);
        selectHotelName.click();
       
        //Select Check In and Check Out Dates
        checkINDate.click();
        checkINDate.sendKeys(Keys.RETURN);
        checkOutDate.click();
        checkOutDate.sendKeys(Keys.RETURN);
        
        //Select traveller
        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        searchBtn.click();
        
        //Assert to check It navigates to Next page
        implicitWait(10);
        Assert.assertEquals(true, listBtn.isDisplayed());

    }

}
