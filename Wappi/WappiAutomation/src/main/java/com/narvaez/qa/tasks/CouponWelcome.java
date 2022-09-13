package com.narvaez.qa.tasks;

import com.narvaez.qa.models.CouponData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.narvaez.qa.userInterfaces.Coupon.*;

public class CouponWelcome implements Task {
    public static String couponData;



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLAIM_COUPON));
        actor.attemptsTo(WaitUntil.the((CODE_COUPON), WebElementStateMatchers.isVisible()));
         couponData = Text.of(CODE_COUPON).viewedBy(actor).asString();

        actor.attemptsTo(Click.on(CLOSE_POPUP_COUPON));
        actor.attemptsTo(Open.url("https://automation-wappi.vercel.app/home"));

    }

    public static CouponWelcome coupon() {
        return Tasks.instrumented(CouponWelcome.class);
    }
}
