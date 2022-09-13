package com.narvaez.qa.tasks;

import com.narvaez.qa.models.CredentialsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.narvaez.qa.userInterfaces.Login.*;
public class LoginUser implements Task {
    private CredentialsData credentialsData;

    public LoginUser(CredentialsData credentialsData) {
        this.credentialsData = credentialsData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentialsData.getUser()).into(USER_NAME));
        actor.attemptsTo(Enter.theValue(credentialsData.getPassword()).into(USER_PASSWORD));
        actor.attemptsTo(Click.on(LOGIN));
    }

    public static LoginUser withData(CredentialsData credentialsData) {
        return new LoginUser(credentialsData);
    }
}
