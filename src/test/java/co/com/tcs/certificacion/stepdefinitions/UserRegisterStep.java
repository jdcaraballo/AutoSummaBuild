package co.com.tcs.certificacion.stepdefinitions;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.interactions.OpenApp;
import io.cucumber.java.en.*;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UserRegisterStep {

    @Given("^que abro la pagina demoblaze$")
    public void queAbroLaPaginaDemoblaze() {
     theActorInTheSpotlight().attemptsTo(
             OpenApp.inPage());
    }
    @When("^registro usuario (.*) con clave (.*)$")
    public void registroUsuario(String user, String key) {
    }

    @Then("^El cliente vera registro exitoso$")
    public void elClienteVeraRegistroExitoso() {
    }
}
