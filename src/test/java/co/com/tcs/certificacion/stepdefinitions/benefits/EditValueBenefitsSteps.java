package co.com.tcs.certificacion.stepdefinitions.benefits;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.benefits.check_detail_benefit.ValEditBenefit;
import co.com.tcs.certificacion.questions.benefits.check_detail_benefit.ValEditFailedNegativeValueBenefit;
import co.com.tcs.certificacion.tasks.autentication.LoginDirAct;
import co.com.tcs.certificacion.tasks.benefits.edit_benefit.EditBenefitsValueCeroById;
import co.com.tcs.certificacion.tasks.benefits.edit_benefit.EditBenefitsValueNegativeById;
import co.com.tcs.certificacion.tasks.benefits.edit_benefit.EditBenefitsValueById;
import co.com.tcs.certificacion.tasks.benefits.edit_benefit.EditBenefitsValueByName;
import io.cucumber.java.en.*;

import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class EditValueBenefitsSteps {
    @Given("^que el Gestor de Beneficios inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesionEnPagina(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
    }
    @When("^el edita beneficios de cedula (.*) cambia el monto seleccionado por (.*)$")
    public void elEditataBeneficiosDeCedula(String id, String editBenefitValue) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EditBenefitsValueById.editBenefitsById(id, editBenefitValue)
        );
    }
    @Then("^se veran los beneficios del colaborador en pantalla$")
    public void seVeraBeneficioEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValEditBenefit.inPage()));
    }
    @When("^el edita beneficios por nombre (.*) cambia el monto seleccionado por (.*)$")
    public void consultaBeneficiosPorNombre(String name, String editBenefitValue) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EditBenefitsValueByName.editBenefitsByName(name, editBenefitValue)
        );
    }
    @Then("^se veran los beneficios en la interfaz$")
    public void seVeraDetallesEnLaInterfaz() {
                theActorInTheSpotlight().should(seeThat(ValEditBenefit.inPage()));
    }
    @When("^el edita beneficios en Filtro cedula (.*) cambia el monto seleccionado negativo de (.*)$")
    public void editaBeneficiarioEnFiltroPorCedula(String cedulaFilter, String editBenefitNegativeValue) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EditBenefitsValueNegativeById.editBenefitsValueNegativeById(cedulaFilter, editBenefitNegativeValue)
        );
    }
    @Then("^se vera mensaje de error en pantalla$")
    public void seVeranMensajeDeError() {
        theActorInTheSpotlight().should(seeThat(ValEditFailedNegativeValueBenefit.inPage()));
    }
    @When("^el edita beneficios en Filtro cedula (.*) cambia el monto seleccionado por (.*)$")
    public void editaBeneficiarioFiltroPorCedula(String cedulaFilter, String editBenefitCeroValue) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EditBenefitsValueCeroById.editBenefitsValueCeroById(cedulaFilter, editBenefitCeroValue)
        );
    }
    @Then("^se vera mensaje de error$")
    public void seVeranMensajeDeErrorEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValEditBenefit.inPage()));
    }
}