package com.narvaez.qa.stepsdefinitions;

import com.narvaez.qa.models.ProfileData;
import com.narvaez.qa.tasks.ProfileUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class profileStepDefinitions {

    @When("^add new information$")
    public void addNewInformation(List<ProfileData> data) {
    OnStage.theActorInTheSpotlight().attemptsTo(ProfileUser.whitData(data.get(0)));
    }

    @Then("^he can see the updated information$")
    public void heCanSeeTheUpdatedInformation() {

    }


}
