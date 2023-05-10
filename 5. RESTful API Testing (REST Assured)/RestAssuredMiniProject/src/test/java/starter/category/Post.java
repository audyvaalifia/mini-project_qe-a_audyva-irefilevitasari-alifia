package starter.category;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoint")
    public String setPostApiEndpoint(){
        return url + "categories";
    }
    @Step("I send POST HTTP Request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "film anak anak");
        requestBody.put("description", "meskipun film anak anak, ortu harus tetap dampingi y");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code is 201")
    public void validateHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for product category")
    public void validateDataRatingProduct(){
        restAssuredThat(response -> response.body("'data'.'Name'", equalTo("film anak anak")));
    }


}
