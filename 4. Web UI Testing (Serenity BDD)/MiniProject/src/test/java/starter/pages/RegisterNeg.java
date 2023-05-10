package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterNeg extends PageObject {
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
    public void RegisterNeg1() {
        $(signinhomeButton()).click();
    }
    @Step
    public void RegisterNeg2() {
        $(registerLink()).click();
    }
    @Step
    public void RegisterNeg3(String text) {
        $(FullnameField()).type(text);
    }

    @Step
    public void RegisterNeg4(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void RegisterNeg5(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void RegisterNeg6() {
        $(regButton()).click();
    }
}
