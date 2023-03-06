package co.com.tcs.certificacion.stepdefinitions.benefits;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.benefits.check_detail_benefit.ValFailedBenefit;
import co.com.tcs.certificacion.questions.benefits.check_detail_benefit.ValidateCheckDetailBenefit;
import co.com.tcs.certificacion.tasks.autentication.LoginDirAct;
import co.com.tcs.certificacion.tasks.benefits.serch_detail_benefit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckDetailBenefitsSteps {
    @Given("^que el Gestor Senior de Beneficios inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
    }
    @When("^el consulta beneficios de cedula (.*)$")
    public void elConsultaBeneficiosDeCedula(String cedula) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewDetailBenefitsById.viewDetailBenefitsById(cedula)
        );
    }
    @Then("^se veran los beneficios en pantalla$")
    public void seVeranBeneficiosEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateCheckDetailBenefit.inPage()));
    }
    @When("^el consulta beneficios por nombre (.*)$")
    public void consultaBeneficiosPorNombre(String name) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewDetailBenefitsByName.viewDetailBenefitsByName(name)
        );
        }
    @Then("^se veran los beneficios en la pantalla$")
    public void seVeraDetalleEnPantalla() {
                theActorInTheSpotlight().should(seeThat(ValidateCheckDetailBenefit.inPage()));
    }
    @When("^el consulta los beneficios de cedula inexistente (.*)$")
    public void elConsultaBeneficiosDeCedulaInexistente(String idFailed) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CheckBenefitsByFailedId.checkBenefitsByFailedId(idFailed));
    }
    @Then("^se vera mensaje: no hay datos disponibles$")
    public void seVeraMensajeDeNoRegistroEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValFailedBenefit.inPage()));
    }
    @When("^el consulta beneficios en Filtro Tipo de beneficio (.*)$")
    public void consultaBeneficiarioInexistenteEnFiltroGeneral(String benefitType) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CheckDetailBenefitsByBenefitsType.checkDetailBenefitsByBenefitType(benefitType)
        );
    }
    @Then("^se vera mensaje de no hay datos disponibles$")
    public void seVeraMensajeDeNOHayDatosDisponiblesEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateCheckDetailBenefit.inPage()));
    }
    @When("^el consulta por filtro Compania (.*)$")
    public void consultaBeneficiosPorCompania(String companyBenefit) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CheckDetailBenefitsByCompany.checkDetailBenefitsByCompanyBenefits(companyBenefit)
        );
    }
    @Then("^se vera listado de companias$")
    public void seVeraListadoDeCompanias() {
        theActorInTheSpotlight().should(seeThat(ValidateCheckDetailBenefit.inPage()));
    }
    @When("^el consulta por Filtro Auxilios (.*)$")
    public void consultaBeneficiosDeAuxilios (String auxiliosBenefits) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CheckDetailBenefitsByAuxilios.checkDetailBenefitsByAuxilios(auxiliosBenefits)
        );
    }
    @Then("^se vera listado de beneficios de Auxilios$")
    public void seVeraListadoDeBeneficiosDeAuxilios() {
        theActorInTheSpotlight().should(seeThat(ValidateCheckDetailBenefit.inPage()));
    }
    @When("^el consulta por Tipo de Beneficios Polizas (.*)$")
    public void consultaBeneficiosDePolizas (String polizasBenefits) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewBenefitsByBenefitsTypeFilter.viewBenefitsByBenefitsTypeFilter(polizasBenefits)
        );
    }
    @Then("^se vera listado de beneficios de Polizas$")
    public void seVeraListadoDeBeneficiosDePolizas() {
        theActorInTheSpotlight().should(seeThat(ValidateCheckDetailBenefit.inPage()));
    }
}