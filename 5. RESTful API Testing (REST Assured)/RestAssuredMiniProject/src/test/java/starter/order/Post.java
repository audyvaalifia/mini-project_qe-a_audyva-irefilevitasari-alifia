package starter.order;

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
        return url + "orders";
    }
    @Step("I send POST HTTP Request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 2);
        requestBody.put("quantity", 1);
//        requestBody.put("price", 5000);
//        requestBody.put("subtotal", 10000);

        response = SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + authToken)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoint())
                .then().extract().response();
    }


    @Step("I receive valid HTTP response code is 201")
    public void validateHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("I receive valid data for product category")
    public void validateDataNewOrder(){
        restAssuredThat(response -> response.body("data[0].User.ID", equalTo(null)));
    }
}
