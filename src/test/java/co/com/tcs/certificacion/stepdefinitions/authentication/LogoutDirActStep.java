package co.com.tcs.certificacion.stepdefinitions.authentication;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.autentication.ValidateLogoutDirAct;
import co.com.tcs.certificacion.tasks.autentication.LoginDirAct;
import co.com.tcs.certificacion.tasks.autentication.LogoutDirAct;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogoutDirActStep {

    @Given("^que el abre pagina Expocolaborador$")
    public void queElAbrePagina() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }
    @When("^el cierra la sesion desde el DA con usuario (.*) con clave (.*)$")
    public void gestorCierralaSesionFronDirAct(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogoutDirAct.logoutFromDa()
        );    }
    @Then("^se vera pantalla de inicio$")
    public void pantallaDeInicio() {
        theActorInTheSpotlight().should(seeThat(ValidateLogoutDirAct.inPage()));
    }
}
