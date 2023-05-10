package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ViewDetailPos;

public class ViewDetailPosSteps {
    @Steps
    ViewDetailPos ViewDetailPos;

    @Given("I am on the Homepage")
    public void onTheNonAccountHomePage(){
        ViewDetailPos.openUrl("https://alta-shop.vercel.app/");
        ViewDetailPos.validateOnHomePage();
    }
    @When("I choose product i want")
    public void clickLoginHomeButton(){
        ViewDetailPos.clickChoose();
    }
    @And("I click detail button in one of many items")
    public void clickCartIcon(){
        ViewDetailPos.clickDetailIcon();
    }
    @Then("I have seen the details of product")
    public void validateOnDetailPage(){
        ViewDetailPos.validateOnDetailPage();
    }
}
