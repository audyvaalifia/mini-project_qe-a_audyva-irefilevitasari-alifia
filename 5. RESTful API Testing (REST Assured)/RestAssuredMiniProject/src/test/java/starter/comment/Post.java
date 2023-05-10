package starter.comment;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected static String url = "https://altashop-api.fly.dev/api/";
    private String authToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";
    private Response response;

    @Step("I set POST api endpoint")
    public String setPostApiEndpoint(){
        return url + "products/14117/comments";
    }

    @Step("I send POST HTTP Request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "wah ini bagus banget filmnya aku sampe nangis 1 jam");

        response = SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + authToken)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoint())
                .then().extract().response();
    }

    @Step("I receive valid HTTP response code is 201")
    public void validateHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for product comment")
    public void validateDataRatingProduct(){
        restAssuredThat(response -> response.body("'data'.'Content'", equalTo("wah ini bagus banget filmnya aku sampe nangis 1 jam")));
    }
}
