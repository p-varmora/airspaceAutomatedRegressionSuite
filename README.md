airSpace_technicalAssessment Pre-Requisite : 
--

1. java --version : 
openjdk 15.0.1 2020-10-20
OpenJDK Runtime Environment (build 15.0.1+9-18)
OpenJDK 64-Bit Server VM (build 15.0.1+9-18, mixed mode, sharing)

2. mvn --version : 
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: /Users/p_varmora/apache-maven-3.6.3
Java version: 15.0.1, vendor: Oracle Corporation, runtime: /Users/p_varmora/Library/Java/JavaVirtualMachines/openjdk-15.0.1/Contents/Home
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.16", arch: "x86_64", family: "mac"

3. chromedriver version: (install in /usr/local/bin)
https://chromedriver.storage.googleapis.com/index.html?path=91.0.4472.19/
chromedriver_mac64_m1.zip

4. Google chrome-browser version : 90.0.4430.212

5. TestNG version: 6.14.3

6. Selenium version: 3.141.59

7. IntelliJ IDEA Community Edition 2020.2.4

Automation-framework walk-through: (included java-doc in each class for better understanding)
--
1. LoginPageTest Class -> 
    1. validate_userLogin_with_validCredentials() - (priority = 1, groups = "regression")
    2. validate_userLogin_with_invalidCredentials() - (priority = 2, groups = "regression")
    3. validate_userLogin_with_blankFields() - (priority = 3, groups = "regression")
    4. validate_LogoutFunctionality() - (priority = 4, groups = "regression")
    5. validate_LogoutAndLogin_withBrowserButton() - (priority = 5, groups = "regression")
    6. validate_userLogin_when_validUsername_invalidPassword() - (priority = 6, groups = "functional")
    7. validate_userLogin_when_invalidUsername_validPassword() - (priority = 7, groups = "functional")

3. BaseTestClass -> This the main class - for intializing web-driver object, chrome-browser and  all the possible functionalities
    1.initializingChormeBrowser()
    2.navigateLoginPage()
    3.closeChromeBrowser()
    4.isPageLoaded()
    5.clickOn()

4. LoginPageClass -> This the login-page class with constructor - for login-page related web-elements and methods 
    Webelements : 1.userNameTextBox
                  2.passwordTextBox
                  3.loginButton

    function() :  1.userLoginCredentials()

6. LogoutPageClass -> This the logout-page class with constructor - for logout-page related web-elements and methods. 
    WebElement : 1.logoutButton 

Build-SUCCESS Logs: 
--

chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 1622
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1625872399.187][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
Jul 09, 2021 4:13:20 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Login Page...
enter valid credentials...
click on login button...
User logged into a secure area!
chrome-browser Ended...


Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 15701
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
chrome-browser started...
[1625872406.577][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
Jul 09, 2021 4:13:26 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Login Page...
enter invalid credentials...
click on login button...
username is invalid
chrome-browser Ended...


chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 25584
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1625872412.523][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
Jul 09, 2021 4:13:32 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Login Page...
keep blank username and password fields...
click on login button...
username is invalid
chrome-browser Ended...


chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 14851
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1625872417.814][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
Jul 09, 2021 4:13:38 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Login Page...
enter valid credentials...
click on login button...
User logged into a secure area!
click on logout button...
User logged out of the secure area!
chrome-browser Ended...


chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 13706
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1625872422.856][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
Jul 09, 2021 4:13:43 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Login Page...
enter valid credentials...
click on login button...
User logged into a secure area!
navigated back to home page with browser back button..
navigated forward to login page with bowser forward button..
User logged into a secure area!
chrome-browser Ended...


chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 1820
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1625872428.632][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
Jul 09, 2021 4:13:48 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Login Page...
enter valid-username and invalid-password...
click on login button...
password is invalid
chrome-browser Ended...


chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 30360
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1625872434.050][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
Jul 09, 2021 4:13:54 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Login Page...
enter invalid-username and valid-password...
click on login button...
username is invalid
chrome-browser Ended...


===============================================
Default Suite
Total tests run: 7, Failures: 0, Skips: 0
===============================================


Process finished with exit code 0
