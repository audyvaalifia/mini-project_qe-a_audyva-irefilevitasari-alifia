package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;

public class RegisterPos extends PageObject {
    private By signinhomeButton() {
        return By.xpath("//button[@type='button']//span[contains(@class, 'v-btn__content')]//i[contains(@class, 'fa-sign-in')]");
    }

    private By registerLink() {
        return By.xpath("//div[@class='mt-3 text-center']//a[contains(@href, '/auth/register')]");

    }
    private By FullnameField(){
        return By.xpath("//label[contains(text(), 'Nama Lengkap')]/following-sibling::input[@type='text']");
    }
    private By emailField(){
        return By.xpath("//label[contains(text(), 'Email')]/following-sibling::input[@type='text']");
    }

    private By passwordField(){
        return By.xpath("//label[contains(text(), 'Password')]/following-sibling::input[@type='text']");
    }
    private By regButton() {
        return By.xpath("//div[@class='text-center']//button[@type='button']//span[contains(@class, 'v-btn__content')]");
    }

    @Step

    public static OpenUrl url(String targeturl){
        return new OpenUrl(targeturl);

    }

    @Step
    public boolean validateOnNonAccountHomePage() {
        return $(signinhomeButton()).isDisplayed();
    }
    public boolean validateOnLoginForm() {
        return $(regButton()).isDisplayed();
    }
    @Step
    public void clickLoginHomeButton() {
        $(signinhomeButton()).click();
    }
    @Step
    public void clickRegisterLink() {
        $(registerLink()).click();
    }
    @Step
    public void inputFullName(String text) {
        $(FullnameField()).type(text);
    }

    @Step
    public void inputValidEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputValidPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickRegisterButton() {
        $(regButton()).click();
    }
}
