package com.narvaez.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Profile {

    public static final Target PROFILE = Target
            .the("abrir pestaña perfil")
            .located(By.xpath("/html/body/app-root/app-home/app-nav-bar/nav/ul[1]/li[4]/a"));


    public static final Target UPLOAD_IMG = Target
            .the("agregar imagen")
            .located(By.id("image"));

    public static final Target NAME_INPUT = Target
            .the("agrega nombre")
            .located(By.id("name"));

    public static final Target SURNAME_INPUT = Target
            .the("agrega apellido")
            .located(By.id("lastName"));

    public static final Target BIRTH_INPUT = Target
            .the("agrega fecha de nacimiento")
            .located(By.id("bornDate"));

    public static final Target SAVE_BUTTON = Target
            .the("guarda cambios")
            .located(By.id("save-profile"));

}
