package co.com.tcs.certificacion.stepdefinitions;

import co.com.tcs.certificacion.interactions.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OpenAppStep {

//    @Before
//    public void prepararEscenario(){
//        setTheStage(new OnlineCast());
//        theActorCalled("Gestor");
//    }
    @Given("^que abro la pagina app expo$")
    public void queAbroLaPaginaApp() {
     theActorInTheSpotlight().attemptsTo(
             HomePage.inPage());
    }
    @When("^consulto$")
    public void registroUsuario() {
    }

    @Then("^veo$")
    public void elClienteVeraRegistroExitoso() {
    }
}
