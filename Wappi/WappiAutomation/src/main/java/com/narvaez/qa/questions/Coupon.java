package com.narvaez.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.narvaez.qa.userInterfaces.Coupon.CODE_COUPON;

public class Coupon implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CODE_COUPON), WebElementStateMatchers.isVisible()));
        return Text.of(CODE_COUPON).viewedBy(actor).asString();
    }
    public static Coupon message() {return new Coupon();}
}
