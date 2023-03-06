package co.com.tcs.certificacion.stepdefinitions.authentication;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.autentication.ValidateLoginBtoC;
import co.com.tcs.certificacion.tasks.autentication.LoginB2C;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginBtoCStep {
    @Given("^que el abre la pagina principal$")
    public void queElAbreLaPaginaPrincipal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }
    @When("^el inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesionFromBtoC(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginB2C.login(user, key));
    }
    @Then("^se vera la pantalla de inicio del gestor senior$")
    public void pantallaDeInicioDelGestorSenior() {
        theActorInTheSpotlight().should(seeThat(ValidateLoginBtoC.inPage()));
    }
}