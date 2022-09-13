package com.narvaez.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Order {

    public static final Target SELECT_PRODUCT = Target
            .the("Compra producto")
            .located(By.xpath("//*[@id=\"offer-0\"]/td[7]/button"));

    public static final Target CONFIRM_ORDER = Target
            .the("Confirma compra del producto")
            .located(By.id("order-confirm"));

    public static final Target CLOSE_POPUP = Target
            .the("Cierra ventana emergente")
            .located(By.xpath("//*[@id=\"confirmation-modal\"]/div/span"));

    public static final Target CLICK_ORDERS = Target
            .the("Click en Mis Pedidos")
            .located(By.xpath("/html/body/app-root/app-home/app-nav-bar/nav/ul[1]/li[3]/a"));


    public static final Target VALIDATE_ORDER = Target
            .the("Valida compra del producto")
            .located(By.id("order-0"));
}
