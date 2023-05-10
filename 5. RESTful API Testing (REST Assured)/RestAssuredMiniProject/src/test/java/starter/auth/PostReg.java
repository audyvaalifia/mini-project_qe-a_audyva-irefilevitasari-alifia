package starter.auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostReg {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoint")
    public String setPostApiEndpoint(){
        return url + "auth/register";
    }
    @Step("I send POST HTTP Request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "boboiboytaufan11@gmail.com");
        requestBody.put("password", "sayaganteng123");
        requestBody.put("fullname", "Boboiboy Taufan bin Amat");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code is 201")
    public void validateHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for product category")
    public void validateDataRatingProduct(){
        restAssuredThat(response -> response.body("'data'.'Email'", equalTo("boboiboytaufan11@gmail.com")));
        restAssuredThat(response -> response.body("'data'.'Password'", equalTo("sayaganteng123")));

    }


}
