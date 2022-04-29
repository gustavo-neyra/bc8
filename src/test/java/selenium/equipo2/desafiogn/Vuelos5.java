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

public class Vuelos5 {
    //atributos
    public static WebDriver driver;
    public By aceptarCookie = By.xpath("//em[@class=\"btn-text\"]");
    public By vuelo = By.xpath("//a[@class=\"shifu-3-button-circle FLIGHTS paint-circle \"]");
    public By multidestino = By.xpath("//span[text()='Multi']");
    public By agregartramo = By.xpath("(//span[@class=\"sbox-segment-label sbox-add-segment-label sbox-bind-event-add-segment\"])[1]");
    public By origen1 = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-segment-1-origin-input sbox-primary sbox-places-first places-inline\"]");
    public By resultado = By.xpath("//span[@class=\"item-text\"]");
    public By destino1 = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-segment-1-destination-input sbox-secondary sbox-places-second places-inline\"]");
    public By destino2 = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-segment-2-destination-input sbox-secondary sbox-places-second places-inline\"]");
    public By destino3 = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-segment-3-destination-input sbox-secondary sbox-places-second places-inline\"]");
    public By calendario1 = By.xpath("//input[@class=\"input-tag sbox-bind-reference-flight-segment-1-start-date-input sbox-bind-value-start-date-segment-1 \"]");
    public By calendario2 = By.xpath("//input[@class=\"input-tag sbox-bind-reference-flight-segment-2-start-date-input sbox-bind-value-start-date-segment-2 \"]");
    public By calendario3 = By.xpath("//input[@class=\"input-tag sbox-bind-reference-flight-segment-3-start-date-input sbox-bind-value-start-date-segment-3 \"]");
    public By fecha1 = By.cssSelector("body > div.datepicker-flights-segment-1.sbox-v4-components > div > div._dpmg2--months > div:nth-child(2) > div._dpmg2--dates > span:nth-child(10)");
    public By fecha2 = By.cssSelector("body > div.datepicker-flights-segment-2.sbox-v4-components > div > div._dpmg2--months > div:nth-child(2) > div._dpmg2--dates > span:nth-child(15)");
    public By fecha3 = By.cssSelector("body > div.datepicker-flights-segment-3.sbox-v4-components > div > div._dpmg2--months > div:nth-child(2) > div._dpmg2--dates > span:nth-child(20)");
    public By aceptarfecha = By.xpath("(//button[@class=\"_dpmg2--desktopFooter-button _dpmg2--desktopFooter-button-apply sbox-3-btn -lg -primary\"])[1]");
    public By buscar = By.xpath("//div[@class=\"sbox-button button-multitrip -ml3-m\"]");

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
    public void ATC05V() {
        driver.get("https://www.viajesfalabella.cl");
        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement webElementCookies = driver.findElement(aceptarCookie);
        webElementCookies.click();

        WebElement webElementVuelo = driver.findElement(vuelo);
        webElementVuelo.click();
        //seleccionar Multidestino
        WebElement webElementMultiDestino = driver.findElement(multidestino);
        webElementMultiDestino.click();
        //opción Agregar tramo
        WebElement webElementAgregarTramo = driver.findElement(agregartramo);
        webElementAgregarTramo.click();

        WebElement webElementOrigenUno = driver.findElement(origen1);
        webElementOrigenUno.sendKeys("Ezeiza");

        WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));

        WebElement webElementResultado = driver.findElement(resultado);
        webElementResultado.click();
        //tramo 1
        WebElement webElementDestinoUno = driver.findElement(destino1);
        webElementDestinoUno.sendKeys("Arturo Merino Benitez");
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));
        webElementResultado.click();
        //tramo 2
        WebElement webElementDestinoDos = driver.findElement(destino2);
        webElementDestinoDos.sendKeys("Carriel Sur");
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));
        webElementResultado.click();
        //tramo 3
        WebElement webElementDestinoTres = driver.findElement(destino3);
        webElementDestinoTres.sendKeys("Salto, Salto");
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));
        webElementResultado.click();

        //calendario para el tramo 1
        WebElement webElementCalendarioUno = driver.findElement(calendario1);
        webElementCalendarioUno.click();

        WebElement webElementFechaUno = driver.findElement(fecha1);
        webElementFechaUno.click();

        WebElement webElementAceptarFechaUno = driver.findElement(aceptarfecha);
        js.executeScript("arguments[0].scrollIntoView();", webElementAceptarFechaUno);
        webElementAceptarFechaUno.click();

        //calendario para el tramo 2
        WebElement webElementCalendarioDos = driver.findElement(calendario2);
        webElementCalendarioDos.click();

        WebElement webElementFechaDos = driver.findElement(fecha2);

        webElementFechaDos.click();
        WebElement webElementAceptarFechaDos = driver.findElement(aceptarfecha);
        webElementAceptarFechaDos.click();

        //calendario para el tramo 3
        WebElement webElementCalendarioTres = driver.findElement(calendario3);
        webElementCalendarioTres.click();

        WebElement webElementFechaTres = driver.findElement(fecha3);

        webElementFechaTres.click();
        WebElement webElementAceptarFechaTres = driver.findElement(aceptarfecha);
        webElementAceptarFechaTres.click();

        //buscar vuelos disponibles
        WebElement webElementBuscar = driver.findElement(buscar);
        webElementBuscar.click();



    }
}
