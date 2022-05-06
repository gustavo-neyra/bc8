package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends SeleniumBase {
    //atributos
    String Url = "https://www.farmaciasahumada.cl/checkout/cart/";
    By cantidad = By.xpath("(//input[@value=\"1\"])[3]");
    By btnActualizarCompra = By.xpath("//button[@class=\"action update\"]");
    By popUpCantidad = By.xpath("//div[text()='Has excedido el número máximo de unidades que puedes solicitar.']");

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void irALaPagina(){
        goToUrl(Url);
    }

    public void sumarCantidades(String text){
        type(text,cantidad);
    }

    public void actualizarLaCompra(){
        click(btnActualizarCompra);

    }

    public String mensajeCantidades() {
        if (isDisplayed(popUpCantidad)) {
            return "Has excedido el número máximo de unidades que puedes solicitar.";
        }
    }

}
