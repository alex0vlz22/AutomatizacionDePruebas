package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepDefinitions {

    private WebDriver driver;
    private Wait<WebDriver> wait;

    @FindBy(xpath = "//button[contains(text(), 'Login')]")
    private WebElement logInButton;

    @FindBy(how = How.XPATH,using = "(//button)[3]")
    private WebElement bookButton;

    @FindBy(xpath = "//span[contains(text(), 'Username')]")
    private WebElement usernameField;

    @FindBy(css = "input[type='password']")
    private WebElement passwordField;



    @Given("Se navega hacia {string}")
    public void seNavegaHacia(String url) {
        //initilizeWait();
        System.setProperty("webdriver.http.factory", "jdk-http-client"); // Due to 403 forbidden msgs besides to another maven dependency

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver ();
        driver.manage().window().maximize();
        driver.get(url);
    }

    private void initilizeWait() {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @When("La página ha cargado completamente")
    public void la_página_ha_cargado_completamente() {
        //this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.cssSelector("body"))));

    }
    @When("Dar Clic en el enlace del LOGIN")
    public void dar_clic_en_el_enlace_del_login() {
        this.wait.until(ExpectedConditions.elementToBeClickable(this.logInButton));
        this.logInButton.click();

    }
    @When("Llenar el campo de usuario como “jhon”")
    public void llenar_el_campo_de_usuario_como_jhon() {
        this.wait.until(ExpectedConditions.visibilityOf(this.usernameField));
        this.usernameField.sendKeys("Jhon");

    }
    @When("Llenar el campo contraseña cómo “{int}”")
    public void llenar_el_campo_contraseña_cómo(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Dar Clic en el botón LOGIN")
    public void dar_clic_en_el_botón_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Validar que el usuario aparezca en la parte superior derecha")
    public void validar_que_el_usuario_aparezca_en_la_parte_superior_derecha() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Se navega hacia “https:\\/\\/demo.testim.io\\/destinations”")
    public void seNavegaHaciaHttpsDemoTestimIoDestinations() {
    }


    @And("Dar Clic en el enlace del book")
    public void darClicEnElEnlaceDelBook() throws InterruptedException {
        Thread.sleep(3000);
        WebElement bicho = driver.findElement(By.xpath("(//button)[3]"));
        bicho.click();
    }

    @And("complete todos los campos requerido")
    public void completeTodosLosCamposRequerido() throws InterruptedException {
        Thread.sleep(3000);

        //se escribe el nombre
        WebElement name = driver.findElement(By.xpath("(//input)[9]"));
        name.sendKeys("Junior");

        //se escribe el email
        WebElement email = driver.findElement(By.xpath("(//input)[10]"));
        email.sendKeys("juniorllanten@eam.edu.co");

        //se escribe el securityNumber
        WebElement securityNumber = driver.findElement(By.xpath("(//input)[11]"));
        securityNumber.sendKeys("123-45-6789");

        //se escribe el phone
        WebElement phone = driver.findElement(By.xpath("(//input)[12]"));
        phone.sendKeys("3153478630");

        //se seleciona el archivo
        WebElement archivo = driver.findElement(By.cssSelector("div[Class*='CustomerInfo__dropzone-box___27VMo']"));
        WebElement image = driver.findElement(By.cssSelector("input[type='file']"));
        //archivo.sendKeys("C://Users//Santi//Downloads//AutomatizacionDePruebas-master//AutomatizacionDePruebas-master//src//test//resources//img//valorant.png");
        image.sendKeys("C://Users//Santi//Downloads//AutomatizacionDePruebas-master//AutomatizacionDePruebas-master//src//test//resources//img//valorant.png");
        //archivo.click();

        //se pone codigo promocional
        //WebElement code = driver.findElement(By.cssSelector("div[Class*='CustomerInfo__dropzone-box___27VMo']"));
        //code.sendKeys("3153478630");



    }

    @And("pongo un codigo de descuento")
    public void pongoUnCodigoDeDescuento() {

    }

    @Then("El carrito aparecerá con tu compra")
    public void elCarritoApareceraConTuCompra() {
    }
}
