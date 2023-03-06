package co.com.tcs.certificacion.stepdefinitions.credits;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.credits.ValidateEditPayCapitalAndFee;
import co.com.tcs.certificacion.questions.serch_detail_credit.ValidateDetailCredit;
import co.com.tcs.certificacion.tasks.autentication.LoginDirAct;
import co.com.tcs.certificacion.tasks.credits.serch_detail_credit.EditPayCapitalAndFeeCreditById;
import co.com.tcs.certificacion.tasks.credits.serch_detail_credit.SerchDetailCreditByCompany;
import co.com.tcs.certificacion.tasks.credits.serch_detail_credit.SerchDetailCreditByLastName;
import co.com.tcs.certificacion.tasks.credits.serch_detail_credit.SerchDetailCreditByName;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class EditPayCapitalAndFeeStep {
    @Given("^que el Gestor Senior de Creditos inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
    }
    @When("^el consulta detalles del credito por Compania (.*)$")
    public void elConsultaCreditoPorCompania(String company) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchDetailCreditByCompany.serchDetailCreditByCompany(company));
    }
    @Then("^se vera en pantalla el credito del colaborador por Compania$")
    public void seVeraCreditoPOrCompaniaEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateDetailCredit.inPage()));
    }
    @When("^el consulta detalles del credito por cédula (.*) abona (.*) al interes y (.*) al capital$")
    public void elConsultaCreditoPorCedula(String id, String feeApplied, String capitalApplied) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EditPayCapitalAndFeeCreditById.serchDetailCreditById(id, feeApplied, capitalApplied));
    }
    @Then("^se vera en pantalla el credito del colaborador con esa cedula$")
    public void seVeraCreditoPorCedulaEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateEditPayCapitalAndFee.inPage()));
    }

    @When("^el consulta detalles del credito por nombre (.*)$")
    public void elConsultaDetallesCreditoPorNombre(String name) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchDetailCreditByName.serchDetailCreditByName(name));
    }
    @Then("^se vera el detalle del credito por nombre en pantalla$")
    public void seVeraDetallesCreditoPorNombreEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateDetailCredit.inPage()));
    }
    @When("^el consulta detalles del credito por apellido (.*)$")
    public void elConsultaDetallesCreditoPorApellido(String lastName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchDetailCreditByLastName.serchDetailCreditBylastName(lastName));
    }
    @Then("^se vera el detalle del credito por apellidos en pantalla$")
    public void seVeraDetallesCreditoPorApellidoEnLaPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateDetailCredit.inPage()));
    }
}