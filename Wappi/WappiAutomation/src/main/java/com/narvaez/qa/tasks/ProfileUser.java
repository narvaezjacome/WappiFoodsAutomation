package com.narvaez.qa.tasks;

import com.narvaez.qa.models.CredentialsData;
import com.narvaez.qa.models.ProfileData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import static com.narvaez.qa.userInterfaces.Profile.*;

public class ProfileUser implements Task {
    private ProfileData profileData;

    public ProfileUser(ProfileData profileData) {
        this.profileData = profileData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(PROFILE));
        //actor.attemptsTo(Enter.theValue("https://images.pexels.com/photos/13292932/pexels-photo-13292932.jpeg").into(UPLOAD_IMG));
        //actor.attemptsTo(Upload.theFile(file.toPath()).to(UPLOAD_IMG));
        actor.attemptsTo(Enter.theValue(profileData.getName()).into(NAME_INPUT));
        actor.attemptsTo(Enter.theValue(profileData.getSurname()).into(SURNAME_INPUT));
        actor.attemptsTo(Enter.theValue(profileData.getDateOfBirth()).into(BIRTH_INPUT));
        actor.attemptsTo(Click.on(SAVE_BUTTON));

    }

    public static ProfileUser whitData(ProfileData profileData) {
        return new ProfileUser(profileData);
    }
}
