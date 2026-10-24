import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdactinLoginTest {

    WebDriver myDriver;

//  This is my remote change
    
    @BeforeTest
    public void setup(){
        myDriver = new ChromeDriver();
        myDriver.get("https://adactinhotelapp.com/");
        myDriver.manage().window().maximize();
    }

    @Test
    public void validatePageTitle(){
        String pageTitle = myDriver.getTitle();
        Assert.assertEquals(pageTitle,"Adactin.com - Hotel Reservation System");

    }

    // This is local comment

    @AfterTest
    public void closeBrowser(){
        myDriver.quit();
    }

}
