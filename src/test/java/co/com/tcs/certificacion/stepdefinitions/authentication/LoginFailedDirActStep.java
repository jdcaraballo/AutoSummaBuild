package co.com.tcs.certificacion.stepdefinitions.authentication;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.autentication.ValidateFailedLoginDirAct;
import co.com.tcs.certificacion.tasks.autentication.LoginFailedDirAct;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class LoginFailedDirActStep {
    @Given("^que se abre pagina principal$")
    public void queSeAbrePaginaPrincipal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }
    @When("^el inicia sesion desde el DA con un usuario invalido (.*) con clave (.*)$")
    public void gestorIniciaSesionFromDirActiv(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginFailedDirAct.login(user, key));
    }
    @Then("^se vera falla al ingreso al portal$")
    public void pantallaDeInicioDelGestor() {
        theActorInTheSpotlight().should(seeThat(ValidateFailedLoginDirAct.inPage()));
    }
}
