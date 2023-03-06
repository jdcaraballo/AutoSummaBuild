package co.com.tcs.certificacion.stepdefinitions.credits;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.validate_massive_credits.serch_credit_by_company.ValidateCreditByCompanyOk;
import co.com.tcs.certificacion.tasks.autentication.LoginDirAct;
import co.com.tcs.certificacion.tasks.credits.masive_credits.SerchCreditByCompanyOk;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SerchMassiveCreditStep {
    @Given("^que el Gestor Sr de Creditos inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
    }
    @When("^el consulta creditos por compania (.*)$")
    public void consultaCreditosPorCompania(String company) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchCreditByCompanyOk.serchCreditsOk(company));
        }

    @Then("^se veran los creditos por Conpania en pantalla$")
    public void seVeran12creditosCompaniaEnPantalla() {
                theActorInTheSpotlight().should(seeThat(ValidateCreditByCompanyOk.inPage()));
    }
//
//    @When("^el consulta credito por compania (.*) NO Existente$")
//    public void consultaCreditosPorCompaniaNoExistente(String companyNoOk) {
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                SerchCreditByCompanyNoExisting.serchCreditsNoOk(companyNoOk));
//    }
//
//    @Then("^se vera pantalla SIN carga de creditos$")
//    public void noSeVerancreditoEnPantalla() {
//        theActorInTheSpotlight().should(seeThat(ValidateCreditByCompanyNoOk.inPage()));
//    }
//
//    @When("^el consulta credito de cedula (.*)$")
//    public void elConsultaCreditoDeCedula(String id) {
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                SerchCreditById.serchCreditById(id));
//    }
//
//    @Then("^se vera en pantalla el credito del colaborador con esa cedula$")
//    public void seVeraCreditoEnPantalla() {
//        theActorInTheSpotlight().should(seeThat(ValidateCreditById.inPage()));
//    }

//    @When("^el consulta credito por nombre de (.*)$")
//    public void elConsultaPorNombreCredito(String name) {
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                SerchCreditByName.serchCreditByName(name));
//    }
//
//    @Then("^se vera en pantalla el credito del colaborador con ese nombre$")
//    public void seVeraCreditoPorNombreEnPantalla() {
//        theActorInTheSpotlight().should(seeThat(ValidateCreditById.inPage()));
//    }

//    @When("^el consulta credito por APELLIDO de (.*)$")
//    public void elConsultaPorApellidoCredito(String lastName) {
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                SerchCreditByLastName.serchCreditByLastName(lastName));
//    }
//
//    @Then("^se vera en pantalla el credito del colaborador con ese APELLIDO$")
//    public void seVeraCreditoPorApellidoEnPantalla() {
//        theActorInTheSpotlight().should(seeThat(ValidateCreditById.inPage()));
//    }
//
//    @When("^el consulta credito por CONSECUTIVO de (.*)$")
//    public void elConsultaPorConsecutivoCredito(String counterCredit) {
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                SerchCreditByCounter.serchCreditByCounter(counterCredit));
//    }
//
//    @Then("^se vera en pantalla el credito del colaborador con ese CONSECUTIVO$")
//    public void seVeraCreditoPorConsecutivoEnPantalla() {
//        theActorInTheSpotlight().should(seeThat(ValidateCreditById.inPage()));
//    }
//
//
//    @When("^el consulta credito por SALDO ACTUAL de (.*)$")
//    public void elConsultaPorSaldoFinalCredito(String currentBalance) {
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                SerchCreditByCurrentBalance.serchCreditByEndingBalance(currentBalance));
//    }
//
//    @Then("^se vera en pantalla el credito del colaborador con ese SALDO ACTUAL$")
//    public void seVeraCreditoPorSaldoActualEnPantalla() {
//        theActorInTheSpotlight().should(seeThat(ValidateCreditById.inPage()));
//    }
}
