package com.narvaez.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.narvaez.qa.userInterfaces.Order.VALIDATE_ORDER;

public class Order implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((VALIDATE_ORDER), WebElementStateMatchers.isVisible()));
        return Text.of(VALIDATE_ORDER).viewedBy(actor).asString();
    }

    public static Order message() { return new Order();}
}
