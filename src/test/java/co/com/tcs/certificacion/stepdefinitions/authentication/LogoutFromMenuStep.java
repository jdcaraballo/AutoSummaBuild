package co.com.tcs.certificacion.stepdefinitions.authentication;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.autentication.ValidateLogoutDirAct;
import co.com.tcs.certificacion.tasks.autentication.LoginDirAct;
import co.com.tcs.certificacion.tasks.autentication.LogoutFromMenu;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogoutFromMenuStep {

    @Given("^que el abre pagina de Expocolaborador")
    public void queElAbrePaginaPrincipal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }
    @When("^el cierra sesion desde el DA con usuario (.*) con clave (.*)$")
    public void gestorCierraaSesionFronMenu(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogoutFromMenu.logoutFromMenu()
        );    }
    @Then("^se vera pantalla inicio$")
    public void pantallaInicio() {
        theActorInTheSpotlight().should(seeThat(ValidateLogoutDirAct.inPage()));
    }
}
