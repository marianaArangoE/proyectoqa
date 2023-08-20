package co.com.choucair.certificado.proyectobase.stepdefinitions;

import co.com.choucair.certificado.proyectobase.task.Login;
import co.com.choucair.certificado.proyectobase.task.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
public class LoginStepDefinitions {
@Before
public void setStage(){
    OnStage.setTheStage(new OnlineCast());
}


@Given("than Mayi wants to enter in a page")
public void thanMayiWantsToEnterInAPage() {
    OnStage.theActorCalled("Mayi").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
        // Write code here that turns the phrase above into concrete actions

        }
@When("she write (.*)her credentials")
public void sheWriteHerCredentials() {
        // Write code here that turns the phrase above into concrete actions

        }
@Then("she is sign in")
public void sheIsSignIn() {
        // Write code here that turns the phrase above into concrete actions

        }
        }


         /*   @Given("than Mayi wants to lear automation")
public void thanMayiWantsToLearAutomation() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("she search for the course")
public void sheSearchForTheCourse() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("she find a course")
public void sheFindACourse() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}*/