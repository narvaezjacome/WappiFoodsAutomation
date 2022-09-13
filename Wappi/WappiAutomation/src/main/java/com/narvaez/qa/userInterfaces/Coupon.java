package com.narvaez.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Coupon {

    public static final Target CLAIM_COUPON = Target
            .the("reclama cupon")
            .located(By.id("welcome-coupon"));

    public static final Target CODE_COUPON = Target
            .the("valor cupon")
            .located(By.id("coupon-code"));

    public static final Target CLOSE_POPUP_COUPON = Target
            .the("cerrar pop up")
            .located(By.xpath("//*[@id=\"coupon-modal\"]/div/span[1]"));

    public static final Target CLICK_HOME = Target
            .the("vuelve inicio")
            .located(By.xpath("/html/body/app-root/app-home/app-nav-bar/nav/ul[1]/li[1]/a"));

    public static final Target ADD_COUPON = Target
            .the("se agrega codigo del cupon")
            .located(By.id("coupon"));

    public static final Target VALIDATE_ORDER_COUPON = Target
            .the("se valida que el cupon se usara en la compra")
            .located(By.xpath("//*[@id=\"order-0\"]/td[7]"));



}
