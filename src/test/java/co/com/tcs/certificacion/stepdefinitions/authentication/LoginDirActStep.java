package co.com.tcs.certificacion.stepdefinitions.authentication;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.autentication.ValidateLoginBtoC;
import co.com.tcs.certificacion.tasks.autentication.LoginDirAct;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class LoginDirActStep {
    @Given("^que el abre pagina principal$")
    public void queElAbrePaginaPrincipal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }
    @When("^el inicia sesion desde el DA con usuario (.*) con clave (.*)$")
    public void gestorIniciaLaSesionFromDirAct(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
    }
    @Then("^se vera pantalla de inicio del gestor senior$")
    public void pantallaDeInicioDelGestorSenior() {
        theActorInTheSpotlight().should(seeThat(ValidateLoginBtoC.inPage()));
    }
}
