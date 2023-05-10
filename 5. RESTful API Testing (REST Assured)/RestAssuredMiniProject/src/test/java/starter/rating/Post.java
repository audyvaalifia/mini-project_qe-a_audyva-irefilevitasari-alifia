package starter.rating;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected static String url = "https://altashop-api.fly.dev/api/products/";
    private String authToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";
    private Response response;

    @Step("I set POST api endpoints")
    public String setPostApiEndpoint(){
        return url + "14117/ratings";
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 5);

        response = SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + authToken)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoint())
                .then().extract().response();
    }

    @Step("I receive valid HTTP response code 201")
    public void validateHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for new rating product")
    public void validateDataRatingProduct(){
        restAssuredThat(response -> response.body("'data'.'Name'", equalTo("DVD Kimetsu no Yaiba")));
        restAssuredThat(response -> response.body("'data'.'Ratings'", equalTo(5)));
    }
}
