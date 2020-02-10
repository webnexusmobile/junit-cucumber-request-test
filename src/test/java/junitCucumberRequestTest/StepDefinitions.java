package junitCucumberRequestTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.junit.Assert;

import java.net.URL;

public class StepDefinitions {

    HttpResponse<JsonNode> response;
    String baseUrl = "http://httpbin.org";

    @When("I send a GET request")
    public void iSendAGETRequest() {
        response = Unirest.get(baseUrl).asJson();
    }

    @Then("I see response status {int}")
    public void iSeeResponseStatus(int statusCode) {
        Assert.assertEquals(response.getStatus(), statusCode);
    }
}
