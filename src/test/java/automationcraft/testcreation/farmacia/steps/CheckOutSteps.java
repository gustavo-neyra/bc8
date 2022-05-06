package automationcraft.testcreation.farmacia.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.farmacia.pages.CarritoDeComprasPage;
import automationcraft.testcreation.farmacia.pages.CheckOutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class CheckOutSteps {
    CheckOutPage checkOut;
    @Given("que el cliente está en el carrito de compras con al menos {int} producto")
    public void que_el_cliente_está_en_el_carrito_de_compras_con_al_menos_producto(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        checkOut = new CheckOutPage(DriverFactory.getDriver());
        checkOut.irALaPagina();

    }

    @When("el cliente aumenta la cantidad a pedir del producto a un número mayor de {int}")
    public void el_cliente_aumenta_la_cantidad_a_pedir_del_producto_a_un_número_mayor_de(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        checkOut.sumarCantidades("11");

    }

    @When("hace clic en {string}")
    public void hace_clic_en(String string) {
        // Write code here that turns the phrase above into concrete actions
        checkOut.actualizarLaCompra();
    }

    @Then("se debe mostrar un popup que dice {string}")
    public void se_debe_mostrar_un_popup_que_dice(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(checkOut.mensajeCantidades().contains("Has excedido el número máximo de unidades que puedes solicitar."));
    }
}
