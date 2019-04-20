package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.customrestassure.HandleRequest;

import static org.testng.Assert.assertEquals;

/**
 * @autor Marcelo Garay
 */
public class PostManStepdefs {
    private Response response;

    @Given("^GET \"([^\"]*)\" postman endpoint is configured$")
    public void getPostmanEndpointIsConfigured(String headerEndpoint) throws Throwable {
        response = HandleRequest.get(headerEndpoint);
    }

    @Then("^the status code should be (\\d+)$")
    public void theStatusCodeShouldBe(int statusCode) throws Throwable {
        assertEquals(response.getStatusCode(), statusCode);
    }

    @Then("^The response 'data' value is \"([^\"]*)\"$")
    public void theResponseDataValueIs(String expected) throws Throwable {
        String actual = response.body().jsonPath().get("data");

        Assert.assertEquals(expected, actual);
    }

    @Given("^POST \"([^\"]*)\" postman endpoint is configured with value \"([^\"]*)\" as body$")
    public void postPostmanEndpointIsConfiguredWithAsBody(String path, String body) throws Throwable {
        response = HandleRequest.post(path, body);
    }
}
