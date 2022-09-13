package com.narvaez.qa.stepsdefinitions;

import com.narvaez.qa.questions.Coupon;
import com.narvaez.qa.tasks.CouponWelcome;
import com.narvaez.qa.tasks.OrderCoupon;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class orderCouponStepDefinitions {

    String coupon;

    @When("^he claim him welcome coupon$")
    public void heClaimHimWelcomeCoupon() {
        OnStage.theActorInTheSpotlight().wasAbleTo(CouponWelcome.coupon());
        coupon=CouponWelcome.couponData;
    }

    @When("^he click order a product for add coupon$")
    public void heClickOrderAProductForAddCoupon() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OrderCoupon.orderCoupon(coupon));

    }

    @Then("^he can see the order was placed with the coupon (.*)$")
    public void heCanSeeTheOrderWasPlacedWithTheCoupon(String coupon) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Coupon.message(), org.hamcrest.Matchers.is(coupon)));
    }
}
