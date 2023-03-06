package co.com.tcs.certificacion.stepdefinitions.authentication;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.autentication.ValidateLogoutDirAct;
import co.com.tcs.certificacion.tasks.autentication.LoginB2C;
import co.com.tcs.certificacion.tasks.autentication.LogoutBtoC;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class LogoutB2CStep {
    @Given("^que el abre pagina principal del app$")
    public void queElAbrePaginaPrincipal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }
    @When("^el cierra sesion desde el B2C con usuario (.*) con clave (.*)$")
    public void gestorCierraaSesionFronDirAct(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginB2C.login(user, key));
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogoutBtoC.logoutFromBtoC()
        );    }
    @Then("^se vera pantalla de homepage$")
    public void pantallaDeHomePage() {
        theActorInTheSpotlight().should(seeThat(ValidateLogoutDirAct.inPage()));
    }
}
