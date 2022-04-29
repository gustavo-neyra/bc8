package selenium.equipo2;

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

public class VuelosChromeVersion {
    //atributos
    public static WebDriver driver;
    public By aceptarCookie =By.xpath("//em[@class=\"btn-text\"]");
    public By vuelo = By.xpath("//a[@class=\"shifu-3-button-circle FLIGHTS paint-circle \"]");
    public By origen= By.xpath("//input[@placeholder=\"Ingresa desde dónde viajas\"]");
    public By resultado=By.xpath("//span[@class=\"item-text\"]");
    public By destino= By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline\"]");
    public By calendario = By.xpath("(//input[@placeholder=\"Ida\"])[1]");
    public By fechaIda = By.cssSelector("body > div.datepicker-flights-main.sbox-v4-components > div > div._dpmg2--months > div:nth-child(2) > div._dpmg2--dates > span:nth-child(10)");
    public By fechaVuelta = By.cssSelector("body > div.datepicker-flights-main.sbox-v4-components > div > div._dpmg2--months > div:nth-child(2) > div._dpmg2--dates > span:nth-child(20)");
    public By personas = By.xpath("//div[@class=\"input-tag sbox-distribution-container-input -rooms\"]");
    public By sumaradulto = By.xpath("(//div[@class=\"_pnlpk-panel-scroll\"]//descendant:: div[@class=\"_pnlpk-itemRow__item _pnlpk-stepper-adults -medium-down-to-lg\"] //descendant:: a[@class=\"steppers-icon-right sbox-3-icon-plus\"])[6]");
    public By clase = By.xpath("//div[@class=\"_pnlpk-itemRow _pnlpk-select-flight-class-type-container\"] // descendant:: div[@class=\"sbox-3-select -md\"]");
    public By ejecutivo = By.xpath("//div[@class=\"_pnlpk-itemRow _pnlpk-select-flight-class-type-container\"] // descendant:: div[@class=\"sbox-3-select -md\"] // descendant:: option[@value=\"C\"]");
    public By buscar = By.xpath("(//a[@class=\"sbox-3-btn -primary -md sbox-search\"])[1]");
    public static WebDriver driver;
    //public By aceptarCookie = By.xpath("//em[@class=\"btn-text\"]");
    //public By vuelo = By.xpath("//a[@class=\"shifu-3-button-circle FLIGHTS paint-circle \"]");
    //public By origen = By.xpath("//input[@placeholder=\"Ingresa desde dónde viajas\"]");
    public By resultado = By.xpath("//span[@class=\"item-text\"]");
    //public By destino = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline\"]");
    //public By calendario = By.xpath("(//input[@placeholder=\"Ida\"])[1]");
    //public By fechaIda = By.cssSelector("body > div.datepicker-flights-main.sbox-v4-components > div > div._dpmg2--months > div:nth-child(2) > div._dpmg2--dates > span:nth-child(10)");
    /*public By fechaVuelta = By.cssSelector("body > div.datepicker-flights-main.sbox-v4-components > div > div._dpmg2--months > div:nth-child(2) > div._dpmg2--dates > span:nth-child(20)");
    public By personas = By.xpath("//div[@class=\"input-tag sbox-distribution-container-input -rooms\"]");
    public By sumaradulto = By.xpath("(//div[@class=\"_pnlpk-panel-scroll\"]//descendant:: div[@class=\"_pnlpk-itemRow__item _pnlpk-stepper-adults -medium-down-to-lg\"] //descendant:: a[@class=\"steppers-icon-right sbox-3-icon-plus\"])[6]");*/
    public By clase = By.xpath("//div[@class=\"_pnlpk-itemRow _pnlpk-select-flight-class-type-container\"] // descendant:: div[@class=\"sbox-3-select -md\"]");
    //public By ejecutivo = By.xpath("//div[@class=\"_pnlpk-itemRow _pnlpk-select-flight-class-type-container\"] // descendant:: div[@class=\"sbox-3-select -md\"] // descendant:: option[@value=\"C\"]");
    //public By buscar = By.xpath("(//a[@class=\"sbox-3-btn -primary -md sbox-search\"])[1]");
    public By comprar = By.xpath("//a[@class=\"-md eva-3-btn -primary\"]");
    public By checkbox = By.xpath("(//i[@class=\"checkbox-check eva-3-icon-checkmark -eva-3-mr-sm\"])[1]");
    public static WebDriver driver;
    //public By aceptarCookie = By.xpath("//em[@class=\"btn-text\"]");
    //public By vuelo = By.xpath("//a[@class=\"shifu-3-button-circle FLIGHTS paint-circle \"]");
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
    public static WebDriver driver;
    //public By aceptarCookie = By.xpath("//em[@class=\"btn-text\"]");
    //public By vuelo = By.xpath("//a[@class=\"shifu-3-button-circle FLIGHTS paint-circle \"]");
    public By ida = By.xpath("//span[text()='Solo ida']");
    //public By origen = By.xpath("//input[@placeholder=\"Ingresa desde dónde viajas\"]");
    public By resultado = By.xpath("//span[@class=\"item-text\"]");
    //public By destino = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline\"]");
    //public By calendario = By.xpath("//input[@class=\"input-tag sbox-bind-value-start-date-segment-1 sbox-bind-reference-flight-start-date-input \"]");
    //public By fechaIda = By.cssSelector("body > div.datepicker-flights-main.sbox-v4-components > div > div._dpmg2--months > div:nth-child(2) > div._dpmg2--dates > span:nth-child(10)");
    public By aplicarFecha = By.xpath("//button[@class=\"_dpmg2--desktopFooter-button _dpmg2--desktopFooter-button-apply sbox-3-btn -lg -primary\"]");
    //public By buscar = By.xpath("(//a[@class=\"sbox-3-btn -primary -md sbox-search\"])[1]");
    public By equipaje = By.xpath("//span[text()='Equipaje en bodega']");
    public By moneda = By.xpath("(//i[@class=\"radio-circle\"])[2]");
    public By categoria = By.xpath("(//a[@class=\"eva-3-btn-ghost -md\"])[2]");

    @BeforeClass
    public static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void ATC03V(){
        driver.get("https://www.viajesfalabella.cl");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement webElementCookies = driver.findElement(aceptarCookie);
        webElementCookies.click();

        WebElement webElementVuelo = driver.findElement(vuelo);
        webElementVuelo.click();

        WebElement webElementOrigen= driver.findElement(origen);
        webElementOrigen.sendKeys("Ezeiza");

        WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));

        WebElement webElementResultado = driver.findElement(resultado);
        webElementResultado.click();

        WebElement webElementDestino = driver.findElement(destino);
        webElementDestino.sendKeys("Arturo Merino Benitez");
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));
        webElementResultado.click();

        WebElement webElementCalendario = driver.findElement(calendario);
        webElementCalendario.click();

        WebElement webElementFechaIda = driver.findElement(fechaIda);
        webElementFechaIda.click();

        WebElement webElementFechaVuelta = driver.findElement(fechaVuelta);
        js.executeScript("arguments[0].scrollIntoView();",webElementFechaVuelta );
        webElementFechaVuelta.click();

        WebElement webElementPersonas = driver.findElement(personas);
        webElementPersonas.click();

        WebElement webElementSumarAdulto = driver.findElement(sumaradulto);
        webElementSumarAdulto.click();
        webElementSumarAdulto.click();

        WebElement webElementClase = driver.findElement(clase);
        js.executeScript("arguments[0].scrollIntoView();",webElementClase );
        webElementClase.click();

        WebElement webElementEjecutivo = driver.findElement(ejecutivo);
        js.executeScript("arguments[0].scrollIntoView();",webElementEjecutivo );
        webElementEjecutivo.click();

        WebElement webElementBuscar = driver.findElement(buscar);
        webElementBuscar.click();




    }

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
    public void ATC04V() {
        driver.get("https://www.viajesfalabella.cl");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement webElementCookies = driver.findElement(aceptarCookie);
        webElementCookies.click();

        WebElement webElementVuelo = driver.findElement(vuelo);
        webElementVuelo.click();

        WebElement webElementOrigen = driver.findElement(origen);
        webElementOrigen.sendKeys("Ezeiza");

        WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));

        WebElement webElementResultado = driver.findElement(resultado);
        webElementResultado.click();

        WebElement webElementDestino = driver.findElement(destino);
        webElementDestino.sendKeys("Arturo Merino Benitez");
        exWait.until(ExpectedConditions.elementToBeClickable(resultado));
        webElementResultado.click();

        WebElement webElementCalendario = driver.findElement(calendario);
        webElementCalendario.click();

        WebElement webElementFechaIda = driver.findElement(fechaIda);
        webElementFechaIda.click();

        WebElement webElementFechaVuelta = driver.findElement(fechaVuelta);
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

        WebElement webElementBuscar = driver.findElement(buscar);
        webElementBuscar.click();

        WebElement webElementComprar = driver.findElement(comprar);
        // NECESITO PONER UN WAIT PARA QUE QUEDE MAS BONITO
        webElementComprar.click();

        WebElement webElementCheckBox = driver.findElement(checkbox);
        js.executeScript("arguments[0].scrollIntoView();", webElementCheckBox);
        webElementCheckBox.click();

        //Botón Atrás del navegador
        driver.navigate().back();

        driver.switchTo().alert();


    }

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




}
