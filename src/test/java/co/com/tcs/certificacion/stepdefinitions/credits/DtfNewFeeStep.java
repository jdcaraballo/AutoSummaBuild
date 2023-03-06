package co.com.tcs.certificacion.stepdefinitions.credits;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.model.dtf_new.DatosDtfBuilder;
import co.com.tcs.certificacion.tasks.autentication.LoginDirAct;
import co.com.tcs.certificacion.tasks.credits.dtf_add_new_fee.DatosDtf2023;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

public class DtfNewFeeStep {
    @Given("^que el Gestor de Creditos inicia sesion con usuario (.*) con clave (.*)$")
    public void queElGestorSeniorDeCreditosIniciaSesionConUsuarioUpruebasSummaSciComConClaveDXMXhbRUwYoExg(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                DtfAddNewFee.inPage());
    }
    @When("^el agrega fecha del proximo peridio 2023 con los siguientes valores$")
    public void fechaProximoPeriodo(List<Map<String, String>> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DatosDtf2023.inPage(DatosDtfBuilder.con()
                        .description(datos)
                        .initialDate(datos)
                        .finalDate(datos)
                        .feeValue(datos))
        );
    }
    @Then("^se vera mensaje de interes cargado con exito$")
    public void seVeraMensajeExitosoDeCarga() {
//        769101theActorInTheSpotlight().should(seeThat(ValidateBoxAddFee.inPage()));
    }
}
