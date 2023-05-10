package starter.order;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://altashop-api.fly.dev/api/";
    private String authToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";
    private Response response;

    @Step("I set GET API endpoint")
    public String setApiEndpoint(){
        return url + "orders";
    }

    @Step("I send GET HTTP Request")
    public void sendGetHttpRequest(){
        response = SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + authToken)
                .get(setApiEndpoint())
                .then().extract().response();
    }

    @Step("I receive valid HTTP response code is 200")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for product comment")
    public void validateDataTheOrder(){
        restAssuredThat(response -> response.body("data[0].ID", equalTo(null)));
    }
}
