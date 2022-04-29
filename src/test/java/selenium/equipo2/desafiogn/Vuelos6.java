package selenium.equipo2.desafiogn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Vuelos6 {
    //atributos
    public static WebDriver driver;
    public By aceptarCookie = By.xpath("//em[@class=\"btn-text\"]");
    public By vuelo = By.xpath("//a[@class=\"shifu-3-button-circle FLIGHTS paint-circle \"]");
    public By ida = By.xpath("//span[text()='Solo ida']");
    public By origen = By.xpath("//input[@placeholder=\"Ingresa desde dónde viajas\"]");
    public By resultado = By.xpath("//span[@class=\"item-text\"]");
    public By destino = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline\"]");
    public By calendario = By.xpath("//input[@class=\"input-tag sbox-bind-value-start-date-segment-1 sbox-bind-reference-flight-start-date-input \"]");
    public By fechaIda = By.cssSelector("body > div.datepicker-flights-main.sbox-v4-components > div > div._dpmg2--months > div:nth-child(2) > div._dpmg2--dates > span:nth-child(10)");
    public By aplicarFecha = By.xpath("//button[@class=\"_dpmg2--desktopFooter-button _dpmg2--desktopFooter-button-apply sbox-3-btn -lg -primary\"]");
    public By buscar = By.xpath("(//a[@class=\"sbox-3-btn -primary -md sbox-search\"])[1]");
    public By equipaje = By.xpath("//span[text()='Equipaje en bodega']");
    public By moneda = By.xpath("(//i[@class=\"radio-circle\"])[2]");

    public By categoria = By.xpath("(//a[@class=\"eva-3-btn-ghost -md\"])[2]");
    //public By fechaVuelta = By.cssSelector("body > div.datepicker-flights-main.sbox-v4-components > div > div._dpmg2--months > div:nth-child(2) > div._dpmg2--dates > span:nth-child(20)");
    //public By personas = By.xpath("//div[@class=\"input-tag sbox-distribution-container-input -rooms\"]");
    //public By sumaradulto = By.xpath("(//div[@class=\"_pnlpk-panel-scroll\"]//descendant:: div[@class=\"_pnlpk-itemRow__item _pnlpk-stepper-adults -medium-down-to-lg\"] //descendant:: a[@class=\"steppers-icon-right sbox-3-icon-plus\"])[6]");
    //public By clase = By.xpath("//div[@class=\"_pnlpk-itemRow _pnlpk-select-flight-class-type-container\"] // descendant:: div[@class=\"sbox-3-select -md\"]");
    //public By ejecutivo = By.xpath("//div[@class=\"_pnlpk-itemRow _pnlpk-select-flight-class-type-container\"] // descendant:: div[@class=\"sbox-3-select -md\"] // descendant:: option[@value=\"C\"]");



    @BeforeClass
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void ATC06V() {
        driver.get("https://www.viajesfalabella.cl");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement webElementCookies = driver.findElement(aceptarCookie);
        webElementCookies.click();
        //Abre la página Vuelos
        WebElement webElementVuelo = driver.findElement(vuelo);
        webElementVuelo.click();
        //Selecciona la opción Solo Ida
        WebElement webElementIda = driver.findElement(ida);
        webElementIda.click();
        //Elige el aeropuerto de salida
        WebElement webElementOrigen = driver.findElement(origen);
        webElementOrigen.sendKeys("Ezeiza");

        WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));

        WebElement webElementResultado = driver.findElement(resultado);
        webElementResultado.click();
        //Elige el aeropuerto de destino
        WebElement webElementDestino = driver.findElement(destino);
        webElementDestino.sendKeys("Arturo Merino Benitez");
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));
        webElementResultado.click();
        //Elige la fecha
        WebElement webElementCalendario = driver.findElement(calendario);
        webElementCalendario.click();

        WebElement webElementFechaIda = driver.findElement(fechaIda);
        webElementFechaIda.click();

        WebElement webElementAplicarFecha = driver.findElement(aplicarFecha);
        //js.executeScript("arguments[0].scrollIntoView();", webElementAplicarFecha);
        webElementAplicarFecha.click();

        //Buscar Vuelos
        WebElement webElementBuscar = driver.findElement(buscar);
        webElementBuscar.click();

        //Seleccionar Equipaje en bodega
        WebElement webElementEquipajeBodega = driver.findElement(equipaje);
        js.executeScript("arguments[0].scrollIntoView();", webElementEquipajeBodega);
        webElementEquipajeBodega.click();

        //WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));

        //Seleccionar la moneda para el precio del vuelo
        WebElement webElementDolares = driver.findElement(moneda);
        //js.executeScript("arguments[0].scrollIntoView();", webElementDolares);
        webElementDolares.click();


        //me faltan los sliders

        //Opción para cambiar de categoría
        WebElement webElementCambiarCategoria = driver.findElement(categoria);
        webElementCambiarCategoria.click();
        /*WebElement webElementFechaVuelta = driver.findElement(fechaVuelta);
        js.executeScript("arguments[0].scrollIntoView();", webElementFechaVuelta);
        webElementFechaVuelta.click();

        WebElement webElementPersonas = driver.findElement(personas);
        webElementPersonas.click();

        WebElement webElementSumarAdulto = driver.findElement(sumaradulto);
        webElementSumarAdulto.click();
        webElementSumarAdulto.click();

        WebElement webElementClase = driver.findElement(clase);
        js.executeScript("arguments[0].scrollIntoView();", webElementClase);
        webElementClase.click();

        WebElement webElementEjecutivo = driver.findElement(ejecutivo);
        js.executeScript("arguments[0].scrollIntoView();", webElementEjecutivo);
        webElementEjecutivo.click();
        */

    }
}
