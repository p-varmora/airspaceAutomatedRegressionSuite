import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This the Login Page-class, which extends main base-class
 * store all necessary Login-Page web-elements and its functions here
 */
public class LoginPage extends BaseTestClass{

    //to invoke BaseTest class constructor
    public LoginPage(){
        super();
    }

    //Login Page web elements
    WebElement userNameTextBox = webDriver.findElement(By.id("username"));
    WebElement passwordTextBox = webDriver.findElement(By.id("password"));
    WebElement loginButton = webDriver.findElement(By.xpath("//button[@class='radius'][contains(.,'Login')]"));


    /**
     * This method will accept user-name and password as string
     * and will enter username and password
     */
    public void userLoginCredentials(String userName, String password){
        userNameTextBox.sendKeys(userName);
        passwordTextBox.sendKeys(password);
    }
}
