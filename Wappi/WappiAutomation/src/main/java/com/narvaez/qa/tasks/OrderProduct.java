package com.narvaez.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.narvaez.qa.userInterfaces.Order.*;

public class OrderProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_PRODUCT));
        actor.attemptsTo(Click.on(CONFIRM_ORDER));
        actor.attemptsTo(Click.on(CLOSE_POPUP));
        actor.attemptsTo(Click.on(CLICK_ORDERS));
        actor.attemptsTo(Click.on(VALIDATE_ORDER));
    }

    public static OrderProduct product(){return Tasks.instrumented(OrderProduct.class); }
}
