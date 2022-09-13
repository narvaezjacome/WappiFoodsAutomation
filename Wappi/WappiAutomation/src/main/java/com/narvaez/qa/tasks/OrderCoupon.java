package com.narvaez.qa.tasks;

import com.narvaez.qa.models.CredentialsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.narvaez.qa.userInterfaces.Order.*;
import static com.narvaez.qa.userInterfaces.Coupon.*;


public class OrderCoupon implements Task {
    private String coupon;

    public OrderCoupon(String coupon) {
        this.coupon = coupon;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_PRODUCT));
        actor.attemptsTo(Enter.theValue(coupon).into(ADD_COUPON));
        actor.attemptsTo(Click.on(CONFIRM_ORDER));
        actor.attemptsTo(Click.on(CLOSE_POPUP));
        actor.attemptsTo(Click.on(CLICK_ORDERS));
        actor.attemptsTo(Click.on(VALIDATE_ORDER_COUPON));
    }

    public static OrderCoupon orderCoupon(String coupon) {
        return new OrderCoupon(coupon);
    }
}
