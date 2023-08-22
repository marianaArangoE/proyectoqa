package co.com.choucair.certificado.proyectobase.stepdefinitions;

import co.com.choucair.certificado.proyectobase.questions.Answer;
import co.com.choucair.certificado.proyectobase.task.Login;
import co.com.choucair.certificado.proyectobase.task.OpenUp;
import co.com.choucair.certificado.proyectobase.task.Write;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions {
@Before
public void setStage(){
    OnStage.setTheStage(new OnlineCast());
}
@Managed (driver = "chrome" )
private WebDriver herbrowser;

@Given("than Mayi wants to enter in a page")
public void thanMayiWantsToEnterInAPage() {
    System.setProperty ("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe" );
    ChromeOptions options = new ChromeOptions();
    options.addArguments("\"--remote-allow-origins=*\",\"ignore-certificate-errors\"");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    //options.setExperimentalOption("prefs", chromePrefs);
    options.addArguments("--disable-notifications");
    options.addArguments("--disable-popup-blocking");
    options.addArguments("--headless");
    options.addArguments("--disable-gpu");
    //System.setProperties("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver = new ChromeDriver(options);

    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS) ;

    driver.get("http://www.google.com" );
    //Maximizar la ventana del navegador
    driver.manage().window().maximize() ;
    //OnStage.theActorCalled("Mayi").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

        // Write code here that turns the phrase above into concrete actions

        }
@When("she write (.*)her credentials")
public void sheWriteHerCredentials(String Credentials){
    OnStage.theActorInTheSpotlight().attemptsTo(Write.the(Credentials));
        // Write code here that turns the phrase above into concrete actions

        }
@Then("she is sign in")
public void sheIsSignIn(String question) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
        // Write code here that turns the phrase above into concrete actions

        }
        }


