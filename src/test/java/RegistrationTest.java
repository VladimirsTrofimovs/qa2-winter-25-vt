import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.BaseFunc;
import pages.HomePage;
import pages.SignInPage;

import java.util.List;

public class RegistrationTest {
    private final By FIRST_NAME = By.id("user_first_name");
    private final By LAST_NAME = By.id("user_last_name");
    private final By EMAIL = By.id("user_email");
    private final By PASSWORD = By.id("user_password");
    private final By CONFIRM_PASSWORD = By.id("user_password_confirmation");
    private final By MARKETING_CHECKBOX = By.id("user_marketing_consent_1");
    private final By NEWS_CHECKBOX_1 = By.id("user_marketing_consent_2");
    private final By REGISTER_BTN = By.name("commit");
    private final By ERROR_MSG = By.xpath(".//p[@class='users-session-form__error-message']");
    private final String PASSWORD_MATCH_ERROR = "nesakrīt ar apstiprinājumu";

    @Test
    public void passwordInconsistencyTestOnPageObject() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openHomePage()
                .acceptCookies()
                .openLogInPage()
                .openRegistrationPage();

//        baseFunc.openHomePage();
//
//        HomePage homePage = new HomePage(baseFunc);
//        homePage.acceptCookies();
//        homePage.openLogInPage();
//
//
//        SignInPage signInPage = new SignInPage(baseFunc);
//        signInPage.openRegistrationPage();
    }


//    @Test
//    public void passwordInconsistencyTest() {
//        // Open browser window
//        WebDriver browser = new ChromeDriver();
//        browser.manage().window().maximize();
//
//        // Open home page
//        browser.get("http://1a.lv");
//
//        // Accept cookies
//        browser.findElement(ACCEPT_COOKIES_BTN).click();
//
//        // Press registration button
//        browser.findElement(REGISTRATION_BTN).click();
//
//        // Click registration link
//        browser.findElement(REGISTRATION_LINK).click();
////        WebElement registrationLink = browser.findElement(REGISTRATION_LINK);
////
////        Actions actions = new Actions(browser);
////        actions.scrollToElement(registrationLink);
////        actions.perform();
////
////        registrationLink.click();
//
//        // Enter first name
//        browser.findElement(FIRST_NAME).sendKeys("Vladimirs");
//
//        // Enter last name
//        browser.findElement(LAST_NAME).sendKeys("Trofimovs");
//
//        // Enter email
//        browser.findElement(EMAIL).sendKeys("aaasss@ddd.com");
//
//        // Enter password
//        browser.findElement(PASSWORD).sendKeys("Qwerty1234$");
//
//        // Enter password again with mistake
//        browser.findElement(CONFIRM_PASSWORD).sendKeys("Qwerty1234#");
//
//        // Scroll to the registration button
//        WebElement registrationBtn = browser.findElement(REGISTER_BTN);
//
//        Actions actions = new Actions(browser);
//        actions.scrollToElement(registrationBtn);
//        actions.perform();
//
//        // Select marketing checkbox
//        browser.findElement(MARKETING_CHECKBOX).click();
//
//        // Select news checkbox
//        browser.findElement(NEWS_CHECKBOX_1).click();
//
//        // press registration button
//        browser.findElement(REGISTER_BTN).click();
//
//        // Check wrong password error method
//        List<WebElement> errorMessages = browser.findElements(ERROR_MSG);
//        Assertions.assertEquals(1, errorMessages.size(), "Wrong errors amount!");
//        Assertions.assertEquals(PASSWORD_MATCH_ERROR, errorMessages.get(0).getText(), "Wrong error message!");
//    }
}
