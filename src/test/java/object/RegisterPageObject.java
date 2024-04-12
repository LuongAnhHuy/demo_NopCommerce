package object;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.RegisterPageUI;

public class RegisterPageObject extends AbstractPage {
    WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public void clickToRegisterLink() {
        waitToElementClickable(driver, RegisterPageUI.REGISTER_HYPERLINK);
        clickToElement(driver, RegisterPageUI.REGISTER_HYPERLINK);
    }

    public void clickToRegisterButton() {
        waitToElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    public void verifyFirstNameErrorMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.FIRSTNAME_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.FIRSTNAME_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void verifyLastNameErrorMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.LASTNAME_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.LASTNAME_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void verifyEmailErrorMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.EMAIL_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.EMAIL_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void verifyPasswordErrorMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.PASSWORD_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.PASSWORD_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void verifyConfirmPasswordErrorMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.CONFIRM_PASSWORD_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void inputToFirstNameTextbox(String firstName) {
        waitToElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, firstName);
    }

    public void inputToLastNameTextbox(String lastName) {
        waitToElementVisible(driver, RegisterPageUI.LASTNAME_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, lastName);
    }

    public void inputToEmailNameTextbox(String email) {
        waitToElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    public void inputToPasswordTextbox(String password) {
        waitToElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
    }

    public void inputToConfirmPasswordTextbox(String password) {
        waitToElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
    }

    public void VerifyWrongEmailMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.WRONG_EMAIL_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.WRONG_EMAIL_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void inputValidFirstNameTextbox(String firstName) {
        waitToElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, firstName);
    }

    public void inputValidLastNameTextbox(String lastName) {
        waitToElementVisible(driver, RegisterPageUI.LASTNAME_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, lastName);
    }

    public void inputValidEmailTextbox(String email) {
        waitToElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    public void inputValidPasswordTextbox(String password) {
        waitToElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
    }

    public void inputValidConfirmPasswordTextbox(String password) {
        waitToElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
    }

    public void verifySuccessMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.SUCCESS_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.SUCCESS_MESSAGE);
        Assert.assertEquals(actual, expected);
    }
}
