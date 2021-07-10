import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * This the Login-Page Test-class, which extends main base-class
 * create and validate Login-page UI test scenarios here
 */

@Test(groups = "airspaceUIAutomation")
public class LoginPageTest extends BaseTestClass{

    private LoginPage loginPage;
    private LogoutPage logoutPage;

    //to invoke BaseTest class constructor
    public LoginPageTest(){
        super();
    }

    @Test (priority = 1, groups = "regression")
    /*
    Test Scenario#1 : validate that User is able to Login with Valid Credentials
    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Enter the user Valid Credentials
    3.Click on Login button
    4.Validate the Login-Page URL and Print the user logged in succeeded message
    5.Terminate the web-browser
    */
    public void validate_userLogin_with_validCredentials(){

        initializingChormeBrowser();
        navigateLoginPage();
        isPageLoaded();

        loginPage = new LoginPage();
        Reporter.log("enter valid credentials...", true);
        loginPage.userLoginCredentials("tomsmith", "SuperSecretPassword!");
        Reporter.log("click on login button...", true);
        clickOn(loginPage.loginButton, 5);

        String userLoginURl = "https://the-internet.herokuapp.com/secure";
        String expectedUserLoginURl = webDriver.getCurrentUrl();

        Assert.assertEquals(userLoginURl,expectedUserLoginURl);
        validateThroughPageSource();

        closeChromeBrowser();

    }

    @Test (priority = 2, groups = "regression")
     /*
    Test Scenario#2 : validate that User is not able to Login with an invalid Credentials
    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Enter the user invalid username and invalid password
    3.Click on login button
    4.Print the Error message
    5.Terminate the web-browser
    */
    public void validate_userLogin_with_invalidCredentials(){

        initializingChormeBrowser();
        navigateLoginPage();
        isPageLoaded();

        loginPage = new LoginPage();
        Reporter.log("enter invalid credentials...", true);
        loginPage.userLoginCredentials("parthvarmora", "1223");
        Reporter.log("click on login button...", true);
        clickOn(loginPage.loginButton, 5);

        validateThroughPageSource();
        closeChromeBrowser();

    }

    @Test (priority = 3, groups = "regression")
     /*
    Test Scenario#3 : validate that User is not able to Login with an blank Username and blank Password
    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Enter the user blank username and blank password
    3.Click on login button
    4.Print the error message
    5.Terminate the web-browser
    */
    public void validate_userLogin_with_blankFields(){

        initializingChormeBrowser();
        navigateLoginPage();
        isPageLoaded();

        loginPage = new LoginPage();
        Reporter.log("keep blank username and password fields...", true);
        loginPage.userLoginCredentials("", "");
        Reporter.log("click on login button...", true);
        clickOn(loginPage.loginButton, 5);

        validateThroughPageSource();
        closeChromeBrowser();

    }

    @Test (priority = 4, groups = "regression")
     /*
    Test Scenario#4 : validate that User is able to logout after successfully logged in
    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Enter the user valid username and valid password
    3.Click on login button
    4.Print the login succeeded message
    5.Click on logout button
    6.Validate that user logged out and print the logout succeeded message
    7.Terminate the web-browser
    */
    public void validate_LogoutFunctionality(){
        initializingChormeBrowser();
        navigateLoginPage();
        isPageLoaded();

        loginPage = new LoginPage();
        Reporter.log("enter valid credentials...", true);
        loginPage.userLoginCredentials("tomsmith", "SuperSecretPassword!");
        Reporter.log("click on login button...", true);
        loginPage.clickOn(loginPage.loginButton, 5);
        validateThroughPageSource();

        logoutPage = new LogoutPage();
        Reporter.log("click on logout button...", true);
        clickOn(logoutPage.logoutButton, 5);
        String homePageURl = "https://the-internet.herokuapp.com/login";
        String expectedHomePageURl = webDriver.getCurrentUrl();
        Assert.assertEquals(homePageURl,expectedHomePageURl);

        validateThroughPageSource();
        closeChromeBrowser();




    }

    @Test (priority = 5, groups = "regression")
     /*
    Test Scenario#5 : Verify that clicking on the browser back button after successful login should not take the User to log out mode
    and clicking on the browser back button after successful logout should not take the User to a logged-in mode
    Note : but in this case its happening ......

     Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Enter the user valid username and valid password
    3.Click on login button
    4.Print the user login succeeded message
    5.Navigate back to login page without clicking on logout button
    6.Navigate forward without clicking on log-in button and entering credentials
    7.Print the user logged in succeeded message
    8.Terminate the web-browser
    */
    public void validate_LogoutAndLogin_withBrowserButton(){
        initializingChormeBrowser();
        navigateLoginPage();
        isPageLoaded();

        loginPage = new LoginPage();
        Reporter.log("enter valid credentials...", true);
        loginPage.userLoginCredentials("tomsmith", "SuperSecretPassword!");
        Reporter.log("click on login button...", true);
        clickOn(loginPage.loginButton, 5);

        validateThroughPageSource();
        Reporter.log("navigated back to home page with browser back button..", true);
        webDriver.navigate().back();

        String homePageURl = "https://the-internet.herokuapp.com/login";
        String expectedHomePageURl = webDriver.getCurrentUrl();
        Assert.assertEquals(homePageURl,expectedHomePageURl);

        Reporter.log("navigated forward to login page with bowser forward button..", true);
        webDriver.navigate().forward();
        validateThroughPageSource();

        closeChromeBrowser();
    }


    @Test (priority = 6, groups = "functional")
     /*
    Test Scenario#6 : validate that User is not able to Login with an valid Username and invalid Password
    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Enter the user valid username and invalid password
    3.Click on login button
    4.Validate password is invalid and print the message
    5.Terminate the web-browser
    */
    public void validate_userLogin_when_validUsername_invalidPassword(){

        initializingChormeBrowser();
        navigateLoginPage();
        isPageLoaded();

        loginPage = new LoginPage();
        Reporter.log("enter valid-username and invalid-password...", true);
        loginPage.userLoginCredentials("tomsmith", "1234");
        Reporter.log("click on login button...", true);
        clickOn(loginPage.loginButton, 5);

        validateThroughPageSource();
        closeChromeBrowser();

    }

    @Test (priority = 7, groups = "functional")
     /*
    Test Scenario#7 : validate that User is not able to Login with an invalid Username and valid Password
    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Enter the user invalid username and valid password
    3.Click on login button
    4.Validate username is invalid and print the message
    5.Terminate the web-browser
    */
    public void validate_userLogin_when_invalidUsername_validPassword(){

        initializingChormeBrowser();
        navigateLoginPage();
        isPageLoaded();

        loginPage = new LoginPage();
        Reporter.log("enter invalid-username and valid-password...", true);
        loginPage.userLoginCredentials("parthvarmora", "SuperSecretPassword!");
        Reporter.log("click on login button...", true);
        clickOn(loginPage.loginButton, 5);

        validateThroughPageSource();
        closeChromeBrowser();

    }


    /**
     * This method will fetch the page-source and
     * print the page's error or succeeded message,
     */
    private void validateThroughPageSource() {

        String pageSource = webDriver.getPageSource();

        String invalidUsername = "Your username is invalid!";
        String invalidPassword = "Your password is invalid!";

        String userLoginMessage = "You logged into a secure area!";
        String userLogoutMessage = "You logged out of the secure area!";


        if (pageSource.contains(invalidUsername)) {
            System.out.println("username is invalid");
        } else if ((pageSource.contains(invalidPassword))) {
            System.out.println("password is invalid");
        }  else if ((pageSource.contains(userLoginMessage))) {
            System.out.println("User logged into a secure area!");
        } else if ((pageSource.contains(userLogoutMessage))) {
            System.out.println("User logged out of the secure area!");
        }
        else {
            System.out.println("not found in page source");
        }

    }




}
