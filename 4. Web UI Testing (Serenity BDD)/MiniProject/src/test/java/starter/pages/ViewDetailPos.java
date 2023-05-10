package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ViewDetailPos extends PageObject {
    private By choose() {
        return By.id("14482");
    }

    private By DetailIcon(){
        return By.xpath("//button[contains(@class, 'button-beli v-btn v-btn--outlined theme--light v-size--small primary--text')]" +
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
        return $(DetailIcon()).isDisplayed();
    }
    public boolean validateOnDetailPage() {
        return $(CartIcon()).isDisplayed();
    }
    @Step
    public void clickChoose() {
        $(choose()).click();
    }
    @Step
    public void clickDetailIcon(){
        $(DetailIcon()).click();
    }


}
