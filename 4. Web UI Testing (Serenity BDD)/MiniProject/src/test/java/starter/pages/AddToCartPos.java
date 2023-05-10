package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class AddToCartPos extends PageObject {
    private By beliButton() {
        return By.xpath("//button[contains(@class, 'button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text')]" +
                "//span[contains(@class, 'v-btn__content')]");
    }

    private By CartIcon(){
        return By.xpath("//button[@type='button']//span[contains(@class, 'v-btn__content')]" +
                "//i[contains(@class, 'v-icon notranslate fas fa-shopping-cart theme--dark')]");
    }

    @Step
    public static OpenUrl url(String targeturl){
        return new OpenUrl(targeturl);
    }

    @Step
    public boolean validateOnHomePage() {
        return $(beliButton()).isDisplayed();
    }
    public boolean validateOnCartPage() {
        return $(CartIcon()).isDisplayed();
    }
    @Step
    public void clickLoginHomeButton() {
        $(beliButton()).click();
    }
    @Step
    public void clickCartIcon(){
        $(CartIcon()).click();
    }


}
