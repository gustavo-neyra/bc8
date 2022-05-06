package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoDeComprasPage extends SeleniumBase {

    public CarritoDeComprasPage(WebDriver driver) {
        super(driver);
    }
        //atributos
        By btnAgregarAlCarrito = By.xpath("//button[@class=\"action tocart primary \"]");
        By mensajeOkAgregarProductoAlCarrito = By.xpath("//div[@class='toast-message']");
        By contadorProductosEnCarrito = By.xpath("//span[@class=\"counter-number\"]");
        By btnCarrito = By.xpath("//i[@class=\"navbar-tool-icon icon-cart\"]");
        By btnVerCarrito = By.xpath("top-cart-btn-checkout");

        By aumentarCantidad = By.xpath("//input[@data-role=\"cart-item-qty\"]");

        By popUpCantidad = By.xpath("//div[text()='Has excedido el número máximo de unidades que puedes solicitar.']");
    //funciones
        public void irAURLFarmacia(String url){
            goToUrl(url);
        }

        public void clickBtnAgregarCarrito(){
            click(btnAgregarAlCarrito);
        }

        public String validarMensajeIngresoProductoEnCarrito() {

        exwait(mensajeOkAgregarProductoAlCarrito);
        if (isDisplayed(mensajeOkAgregarProductoAlCarrito)) {
            return getText(mensajeOkAgregarProductoAlCarrito);
        }
        return "mensaje no valido";
        }


        public void verProductos(){
            click(btnCarrito);
            click(btnVerCarrito);
        }

}




