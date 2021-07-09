import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * This the Logout Page-class, which extends main base-class
 * store all necessary Login-Page web-elements and its functions here
 */
public class LogoutPage extends BaseTestClass {

    ////to invoke BaseTest class constructor
    public LogoutPage(){
        super();
    }

    //logout page web-element
    WebElement logoutButton = webDriver.findElement(By.xpath("//i[@class='icon-2x icon-signout'][contains(.,'Logout')]"));

}
