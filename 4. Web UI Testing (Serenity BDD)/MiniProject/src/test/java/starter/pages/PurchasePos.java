package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PurchasePos extends PageObject {
    private By signinhomeButton() {
        return By.xpath("//button[@type='button']//span[contains(@class, 'v-btn__content')]//i[contains(@class, 'fa-sign-in')]");
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
    private By beliButton() {
        return By.xpath("//button[contains(@class, 'button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text')]" +
                "//span[contains(@class, 'v-btn__content')]");
    }


    private By CartIcon(){
        return By.xpath("//button[@type='button']//span[contains(@class, 'v-btn__content')]" +
                "//i[contains(@class, 'v-icon notranslate fas fa-shopping-cart theme--dark')]");
    }
    private By BayarButton() {
        return By.id("button-bayar");
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
        return $(CartIcon()).isDisplayed();
    }
    public boolean validateOnTransactionPage() {
        return $(CartIcon()).isDisplayed();
    }
    @Step
    public void clickLoginHomeButton() {
        $(signinhomeButton()).click();
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
    @Step
    public void clickBeliButton() {
        $(beliButton()).click();
    }
    @Step
    public void clickCartIcon(){
        $(CartIcon()).click();
    }
    @Step
    public void clickBayarButton(){
        $(BayarButton()).click();
    }

}
