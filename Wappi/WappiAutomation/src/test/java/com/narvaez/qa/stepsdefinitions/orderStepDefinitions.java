package com.narvaez.qa.stepsdefinitions;

import com.narvaez.qa.questions.Order;
import com.narvaez.qa.tasks.OrderProduct;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class orderStepDefinitions {
    @When("^he click order a product$")
    public void heClickOrderAProduct() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OrderProduct.product());
    }

    @Then("^he can see the order was placed (.*)$")
    public void heCanSeeTheOrderWasPlaced(String order) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Order.message(), org.hamcrest.Matchers.is(order)));

    }
}
