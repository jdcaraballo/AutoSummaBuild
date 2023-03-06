package co.com.tcs.certificacion.stepdefinitions.authentication;


import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.autentication.ValidateFailedLoginBtoC;
import co.com.tcs.certificacion.tasks.autentication.LoginFailedB2C;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class LoginFailedBtoCStep {
    @Given("^que el Gestor abre pagina principal$")
    public void queElGestorAbrePaginaPrincipal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }
    @When("^el inicia sesion desde el B to C con usuario invalido (.*) con clave (.*)$")
    public void gestorIniciaSesionFromBtoC(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginFailedB2C.login(user, key));
    }
    @Then("^se vera mensaje de falla al ingreso al portal$")
    public void seMeraMensajeDeFallaAlIngreso() {
        theActorInTheSpotlight().should(seeThat(ValidateFailedLoginBtoC.inPage()));
    }
}
