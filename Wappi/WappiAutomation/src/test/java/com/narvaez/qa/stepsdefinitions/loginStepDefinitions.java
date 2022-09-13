package com.narvaez.qa.stepsdefinitions;

import com.narvaez.qa.models.CredentialsData;
import com.narvaez.qa.questions.Login;
import com.narvaez.qa.tasks.LoginUser;
import com.narvaez.qa.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class loginStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Yilmer D Narvaez");
    }

    @Given("^That Daniel join Wappi$")
    public void thatDanielJoinWappi() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^He enter the credentials$")
    public void heEnterTheCredentials(List<CredentialsData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.withData(data.get(0)));
    };


    @Then("^the user should see (.*)$")
    public void theUserShouldSee(String textWelcome) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Login.message(), org.hamcrest.Matchers.is(textWelcome)));
    }
}

