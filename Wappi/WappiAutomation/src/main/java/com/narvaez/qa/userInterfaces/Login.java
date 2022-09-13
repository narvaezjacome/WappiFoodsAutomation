package com.narvaez.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static final Target  USER_NAME = Target
            .the("Se ingresa el usuario (email)")
            .located(By.id("username"));

    public static final Target  USER_PASSWORD = Target
            .the("Se ingresa la contrasena")
            .located(By.id("password"));

    public static final Target  LOGIN = Target
            .the("click en iniciar sesión")
            .located(By.id("button-login"));

    public static final Target  VALIDATE_LOGIN = Target
            .the("valida login")
            .located(By.className("app-title"));


}
